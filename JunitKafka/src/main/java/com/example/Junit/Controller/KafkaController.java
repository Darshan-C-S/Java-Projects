//package com.example.Junit.Controller;
//
//import com.example.Junit.Produser.KafkaProducer;
//import org.apache.kafka.common.protocol.types.Field;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class KafkaController {
//    @Autowired
//    private KafkaProducer kafkaProducer;
//
//    @PostMapping("/sendMessage")
//    private String sendMessage(@RequestParam String message){
//        kafkaProducer.sendMessage("myTopic",message);
//        return "message Sent ";
//    }
//
//    @PostMapping("/sendMessage2")
//    private String sendMessage2 (@RequestParam String topic , String message){
//        kafkaProducer.sendMessage("myTopic2", "Hello World");
//        return "Message sent from sendTopic2";
//    }
//
//}
