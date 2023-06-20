package miu.edu.PresentationService.service;

import miu.edu.PresentationService.dao.OntarioEnergyRepository;
import miu.edu.PresentationService.domain.OntarioEnergyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OntarioEnergyServiceImpl implements IOntarioEnergyService {

    @Autowired
    private OntarioEnergyRepository repository;

    public List<OntarioEnergyData> findAll() {
        return repository.findAll();
    }

    @Override
    public List<OntarioEnergyData> findTop2() {
        Sort sort = Sort.by(Sort.Direction.ASC, "date");
        return repository.findTop2By(sort);
    }
}
