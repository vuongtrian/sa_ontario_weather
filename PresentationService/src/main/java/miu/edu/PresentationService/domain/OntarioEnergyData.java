package miu.edu.PresentationService.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class OntarioEnergyData {

    private Date date;
    private OntarioEnergy ontarioEnergy;

    public OntarioEnergyData() {
    }

    public OntarioEnergyData(Date date, OntarioEnergy ontarioWeather) {
        this.date = date;
        this.ontarioEnergy = ontarioWeather;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OntarioEnergy getOntarioEnergy() {
        return ontarioEnergy;
    }

    public void setOntarioEnergy(OntarioEnergy ontarioEnergy) {
        this.ontarioEnergy = ontarioEnergy;
    }

    @Override
    public String toString() {
        return "OntarioWeatherData{" +
                "date=" + date +
                ", ontarioWeather=" + ontarioEnergy +
                '}';
    }
}
