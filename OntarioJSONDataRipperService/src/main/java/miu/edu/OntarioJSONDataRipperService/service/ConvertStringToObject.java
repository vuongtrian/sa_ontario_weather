package miu.edu.OntarioJSONDataRipperService.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import miu.edu.OntarioJSONDataRipperService.domain.OntarioEnergy;

public class ConvertStringToObject {
    public static OntarioEnergy covertFromJsonToOntario (String jsonString) {
        OntarioEnergy ontarioWeather;
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
            String nuclearPercentage = jsonNode.get("nuclearPercentage").asText();
            String nuclearOutput = jsonNode.get("nuclearOutput").asText();
            String hydroPercentage = jsonNode.get("hydroPercentage").asText();
            String hydroOutput = jsonNode.get("hydroOutput").asText();
            String gasPercentage = jsonNode.get("gasPercentage").asText();
            String gasOutput = jsonNode.get("gasOutput").asText();
            String windPercentage = jsonNode.get("windPercentage").asText();
            String windOutput = jsonNode.get("windOutput").asText();
            String biofuelPercentage = jsonNode.get("biofuelPercentage").asText();
            String biofuelOutput = jsonNode.get("biofuelOutput").asText();
            String solarPercentage = jsonNode.get("solarPercentage").asText();
            String solarOutput = jsonNode.get("solarOutput").asText();
            String imports = jsonNode.get("imports").asText();
            String exports = jsonNode.get("exports").asText();
            String netImportExports = jsonNode.get("netImportExports").asText();

            ontarioWeather = new OntarioEnergy(
                    timeOfReading, powerGenerated,
                    ontarioDemand, totalCo2e,
                    co2eIntensity, nuclearPercentage,
                    nuclearOutput, hydroPercentage,
                    hydroOutput, gasPercentage,
                    gasOutput, windPercentage,
                    windOutput, biofuelPercentage,
                    biofuelOutput, solarPercentage,
                    solarOutput, imports, exports, netImportExports);
            return ontarioWeather;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
