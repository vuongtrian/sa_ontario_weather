package miu.edu.OntarioRealTimeDataInput.controller;

import miu.edu.OntarioRealTimeDataInput.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublishMessageController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/message")
    public void addMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);
    }
}
