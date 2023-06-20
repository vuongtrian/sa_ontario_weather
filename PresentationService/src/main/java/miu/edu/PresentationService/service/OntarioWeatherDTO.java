package miu.edu.PresentationService.service;

public class OntarioWeatherDTO {

    private String timeOfReading;
    private String powerGenerated;
    private String ontarioDemand;
    private String totalCo2e;
    private String co2eIntensity;

    public OntarioWeatherDTO() {
    }

    public OntarioWeatherDTO(String timeOfReading, String powerGenerated, String ontarioDemand, String totalCo2e, String co2eIntensity) {
        this.timeOfReading = timeOfReading;
        this.powerGenerated = powerGenerated;
        this.ontarioDemand = ontarioDemand;
        this.totalCo2e = totalCo2e;
        this.co2eIntensity = co2eIntensity;
    }

    public String getTimeOfReading() {
        return timeOfReading;
    }

    public void setTimeOfReading(String timeOfReading) {
        this.timeOfReading = timeOfReading;
    }

    public String getPowerGenerated() {
        return powerGenerated;
    }

    public void setPowerGenerated(String powerGenerated) {
        this.powerGenerated = powerGenerated;
    }

    public String getOntarioDemand() {
        return ontarioDemand;
    }

    public void setOntarioDemand(String ontarioDemand) {
        this.ontarioDemand = ontarioDemand;
    }

    public String getTotalCo2e() {
        return totalCo2e;
    }

    public void setTotalCo2e(String totalCo2e) {
        this.totalCo2e = totalCo2e;
    }

    public String getCo2eIntensity() {
        return co2eIntensity;
    }

    public void setCo2eIntensity(String co2eIntensity) {
        this.co2eIntensity = co2eIntensity;
    }

    @Override
    public String toString() {
        return "OntarioWeather{" +
                "timeOfReading='" + timeOfReading + '\'' +
                ", powerGenerated='" + powerGenerated + '\'' +
                ", ontarioDemand='" + ontarioDemand + '\'' +
                ", totalCo2e='" + totalCo2e + '\'' +
                ", co2eIntensity='" + co2eIntensity + '\'' +
                '}';
    }
}
