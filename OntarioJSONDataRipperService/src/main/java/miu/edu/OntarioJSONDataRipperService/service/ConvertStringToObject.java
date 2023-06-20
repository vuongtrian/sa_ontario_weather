package miu.edu.OntarioJSONDataRipperService.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import miu.edu.OntarioJSONDataRipperService.domain.OntarioWeather;

public class ConvertStringToObject {
    public static OntarioWeather covertFromJsonToOntario (String jsonString) {
        OntarioWeather ontarioWeather;
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
            ontarioWeather = new OntarioWeather(timeOfReading, powerGenerated, ontarioDemand, totalCo2e, co2eIntensity);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return ontarioWeather;
    }
}
