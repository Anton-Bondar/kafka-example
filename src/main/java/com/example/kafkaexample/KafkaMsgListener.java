package com.example.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMsgListener {

    @KafkaListener(
        topics = "amigoscode",
        groupId = "amigosGroup"
    )
    private void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
