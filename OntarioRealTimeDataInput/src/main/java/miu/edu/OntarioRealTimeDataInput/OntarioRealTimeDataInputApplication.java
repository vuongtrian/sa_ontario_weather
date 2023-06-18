package miu.edu.OntarioRealTimeDataInput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class OntarioRealTimeDataInputApplication {

	public static void main(String[] args) {
		SpringApplication.run(OntarioRealTimeDataInputApplication.class, args);
	}

}
