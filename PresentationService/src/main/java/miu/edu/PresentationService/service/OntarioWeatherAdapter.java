package miu.edu.PresentationService.service;

import miu.edu.PresentationService.domain.OntarioWeather;

public class OntarioWeatherAdapter {
    public static OntarioWeather convertFromDtoToOntarioWeather (OntarioWeatherDTO dto) {
        return new OntarioWeather(
                dto.getTimeOfReading(),
                dto.getPowerGenerated(),
                dto.getOntarioDemand(),
                dto.getTotalCo2e(),
                dto.getCo2eIntensity()
        );
    }
}
