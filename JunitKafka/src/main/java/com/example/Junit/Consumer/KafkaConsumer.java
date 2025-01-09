//package com.example.Junit.Consumer;
//
//import org.apache.kafka.common.protocol.types.Field;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KafkaConsumer {
//
//    @KafkaListener(topics = "myTopic" ,groupId = "myGroup")
//    private void Listener(String message){
//        System.out.println("The message listening :"+ message);
//    }
//
////    @KafkaListener(topics = "myTopic2", groupId = "myGroup")
////    private void Listner2(String message){
////        System.out.println("The message from topic 2 : "+ message);
////    }
//
//}
//
//
