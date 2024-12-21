package com.DA.kafkademo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerData {

    private  static final Logger log= LoggerFactory.getLogger(KafkaConsumerData.class);


//    @KafkaListener(topics = "javaguides", groupId = "myGroup")
//    public void Consume1(String message)
//    {
//        log.info(String.format("Message Received By Consumer in javaguide Topic -> %s", message));
//    }

//    @KafkaListener(topics = "javaguides", groupId = "myGroup")
//    public void consume2(String message)
//    {
//        log.info(String.format("Message Received By Consumer in javaguide Topic -> %s", message));
//
//    }
}
