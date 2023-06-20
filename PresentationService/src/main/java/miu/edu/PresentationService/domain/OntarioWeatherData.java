package miu.edu.PresentationService.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.SimpleDateFormat;
import java.util.Date;

@Document
public class OntarioWeatherData {

    private Date date;
    private OntarioWeather ontarioWeather;

    public OntarioWeatherData() {
    }

    public OntarioWeatherData(Date date, OntarioWeather ontarioWeather) {
        this.date = date;
        this.ontarioWeather = ontarioWeather;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OntarioWeather getOntarioWeather() {
        return ontarioWeather;
    }

    public void setOntarioWeather(OntarioWeather ontarioWeather) {
        this.ontarioWeather = ontarioWeather;
    }

    @Override
    public String toString() {
        return "OntarioWeatherData{" +
                "date=" + date +
                ", ontarioWeather=" + ontarioWeather +
                '}';
    }
}
