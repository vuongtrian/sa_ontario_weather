package miu.edu.PresentationService.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertStringToObject {
    public static OntarioWeatherDTO covertFromJsonToOntario (String jsonString) {
        OntarioWeatherDTO ontarioWeatherDTO;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Parse the JSON string
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            // Extract element values
            String timeOfReading = jsonNode.get("timeOfReading").asText();
            String powerGenerated = jsonNode.get("powerGenerated").asText();
            String ontarioDemand = jsonNode.get("ontarioDemand").asText();
            String totalCo2e = jsonNode.get("totalCo2e").asText();
            String co2eIntensity = jsonNode.get("co2eIntensity").asText();
            ontarioWeatherDTO = new OntarioWeatherDTO(timeOfReading, powerGenerated, ontarioDemand, totalCo2e, co2eIntensity);
            return ontarioWeatherDTO;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}