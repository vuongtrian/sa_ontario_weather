package miu.edu.OntarioRealTimeDataInput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    //    public void sendMessage(String message) {
//        kafkaTemplate.send("stream-input", message)
//                .whenComplete((result, ex) -> {
//                    if (ex == null) {
//                        System.out.println("Message sent to topic: {} " + message);
//                    } else {
//                        System.out.println("Failed to send message " + ex);
//                    }
//                });
//    }
    public void sendMessage(String message) {
        kafkaTemplate.send("stream-input", message)
                .addCallback(result -> {
                            System.out.println("Message sent to topic: {} " + message);
                        },
                        ex -> {
                            System.out.println("Failed to send message " + ex);
                        });
    }

}
