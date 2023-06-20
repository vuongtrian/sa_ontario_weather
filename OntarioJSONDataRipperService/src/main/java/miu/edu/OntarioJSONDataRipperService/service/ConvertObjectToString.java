package miu.edu.OntarioJSONDataRipperService.service;

import com.google.gson.Gson;
import miu.edu.OntarioJSONDataRipperService.domain.OntarioWeather;

public class ConvertObjectToString {
    public static String convertFromOntarioWeatherToString (OntarioWeather ontarioWeather) {
        Gson gson = new Gson();
        return gson.toJson(ontarioWeather);
    }
}
