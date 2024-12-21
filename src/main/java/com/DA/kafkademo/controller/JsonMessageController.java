package com.DA.kafkademo.controller;

import com.DA.kafkademo.kafka.JsonKafkaProducer;
import com.DA.kafkademo.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user)
    {
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json Message Send to kafka topic javaguides_json");
    }
}
