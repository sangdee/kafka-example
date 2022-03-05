package io.github.sangdee.kafka_example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class KafkaProducerController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping("/sendMessage")
    public void sendMessage(@RequestParam String message) {
        kafkaProducerService.sendMessage(message);
    }
}
