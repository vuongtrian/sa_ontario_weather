package miu.edu.PresentationService.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class OntarioEnergyData {

    private Date date;
    private OntarioEnergy ontarioWeather;

    public OntarioEnergyData() {
    }

    public OntarioEnergyData(Date date, OntarioEnergy ontarioWeather) {
        this.date = date;
        this.ontarioWeather = ontarioWeather;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OntarioEnergy getOntarioWeather() {
        return ontarioWeather;
    }

    public void setOntarioWeather(OntarioEnergy ontarioWeather) {
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
