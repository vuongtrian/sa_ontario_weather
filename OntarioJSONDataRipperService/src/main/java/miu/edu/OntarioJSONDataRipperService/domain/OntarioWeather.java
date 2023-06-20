package miu.edu.OntarioJSONDataRipperService.domain;

public class OntarioWeather {

    private String timeOfReading;
    private String powerGenerated;
    private String ontarioDemand;
    private String totalCo2e;
    private String co2eIntensity;
    private String nuclearPercentage;
    private String nuclearOutput;
    private String hydroPercentage;
    private String hydroOutput;
    private String gasPercentage;
    private String gasOutput;
    private String windPercentage;
    private String windOutput;
    private String biofuelPercentage;
    private String biofuelOutput;
    private String solarPercentage;
    private String solarOutput;
    private String imports;
    private String exports;
    private String netImportExports;


    public OntarioWeather() {
    }

    public OntarioWeather(String timeOfReading, String powerGenerated, String ontarioDemand, String totalCo2e, String co2eIntensity) {
        this.timeOfReading = timeOfReading;
        this.powerGenerated = powerGenerated;
        this.ontarioDemand = ontarioDemand;
        this.totalCo2e = totalCo2e;
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
