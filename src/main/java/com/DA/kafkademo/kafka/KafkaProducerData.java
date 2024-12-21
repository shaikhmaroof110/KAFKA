package com.DA.kafkademo.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerData {

    //default logger provided by springBoot
    private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);

    private KafkaTemplate<String, String> kafkaTemplate;
    // We are doing constructor based Injection

    public KafkaProducerData(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message)
    {
        log.info(String.format("Message send  %s", message));
       kafkaTemplate.send("javaguides",message);

    }
}
