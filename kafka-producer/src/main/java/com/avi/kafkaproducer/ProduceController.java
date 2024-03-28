package com.avi.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/producer")
public class ProduceController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message) throws ExecutionException, InterruptedException {
        kafkaProducer.sendMessage(message);
    }
}
