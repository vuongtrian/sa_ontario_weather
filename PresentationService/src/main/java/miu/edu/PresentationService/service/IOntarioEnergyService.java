package miu.edu.PresentationService.service;

import miu.edu.PresentationService.domain.OntarioEnergyData;

import java.util.List;

public interface IOntarioEnergyService {
    List<OntarioEnergyData> findAll();

    List<OntarioEnergyData> findTop2();
}
