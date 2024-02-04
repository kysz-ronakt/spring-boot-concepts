package com.dev.apachekafka.util;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "my-topic", groupId = "rt_group_id")
    public void listen(String message){
        System.out.println("Received message: " + message);
    }

}
