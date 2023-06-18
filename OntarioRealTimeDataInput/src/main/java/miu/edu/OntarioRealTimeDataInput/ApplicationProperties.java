package miu.edu.OntarioRealTimeDataInput;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("application")
@Component
public class ApplicationProperties {
    private String applicationId;
    private String streamInput;
    private String streamOutput;
    public String getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
    public String getStreamInput() {
        return streamInput;
    }
    public void setStreamInput(String streamInput) {
        this.streamInput = streamInput;
    }
    public String getStreamOutput() {
        return streamOutput;
    }
    public void setStreamOutput(String streamOutput) {
        this.streamOutput = streamOutput;
    }
}
