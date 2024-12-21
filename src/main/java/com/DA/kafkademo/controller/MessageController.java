package com.DA.kafkademo.controller;

import com.DA.kafkademo.kafka.KafkaProducerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    // If spring bean having only one constructor then we can avoid using @Autowired annotation. (Spring 4.2 onward)
    @Autowired
    private KafkaProducerData kafkaProducerData;

    // http:localhost:8080/api/v1/kafka/publish?message=helloworld
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message)
    {
        kafkaProducerData.sendMessage(message);
        return ResponseEntity.ok("message Send to kafka >>>");

    }
}
