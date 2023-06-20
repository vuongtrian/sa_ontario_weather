package miu.edu.PresentationService.dao;

import miu.edu.PresentationService.domain.OntarioWeatherData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OntarioWeatherRepository extends MongoRepository<OntarioWeatherData, Integer> {
}
