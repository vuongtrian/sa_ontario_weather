package miu.edu.PresentationService.dao;

import miu.edu.PresentationService.domain.Data;
import miu.edu.PresentationService.domain.OntarioEnergyData;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OntarioEnergyRepository extends MongoRepository<OntarioEnergyData, Integer> {
    @Query("{$group: { _id: { hour: { $hour: '$timestampField' } }, count: { $sum: 1 }, document: { $first: '$$ROOT' } }}, " +
            "{$sort: { count: -1 }}, " +
            "{$limit: 2}")
    List<OntarioEnergyData> findTop2ByHour();
}
