package com.avi.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class KafkaConsumer {
    @KafkaListener(topics ="test-topic" ,groupId = "group-id")
    public void consumeMessage(String message){
        System.out.println(message);
    }
}
