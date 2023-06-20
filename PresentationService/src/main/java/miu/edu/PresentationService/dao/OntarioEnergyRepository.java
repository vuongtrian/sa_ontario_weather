package miu.edu.PresentationService.dao;

import miu.edu.PresentationService.domain.Data;
import miu.edu.PresentationService.domain.OntarioEnergyData;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OntarioEnergyRepository extends MongoRepository<OntarioEnergyData, Integer> {
    List<OntarioEnergyData> findTop2By(Sort sort);
}
