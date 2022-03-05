package io.github.sangdee.kafka_example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "sangdee", groupId = "test")
    public void consumer(String message) {
        System.out.println("receive message : " + message);
    }
}
