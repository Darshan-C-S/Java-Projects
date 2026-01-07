package com.example.lambda.controller;

import com.example.lambda.model.Message;
import com.example.lambda.service.MessageService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/hello")
    @Operation(summary = "Returns a greeting Demo message")
    public String sayHello() {
        return "Hello from AWS Lambda!";
    }

    @PostMapping("/message")
    @Operation(summary = "Adds a new message")
    public Message addMessage(@RequestParam String content) {
        return messageService.addMessage(content);
    }

    @DeleteMapping("/message/{id}")
    @Operation(summary = "Deletes a message by ID")
    public String deleteMessage(@PathVariable int id) {
        return messageService.deleteMessage(id) ? "Deleted Successfully" : "Message Not Found";
    }

    @GetMapping("/messages")
    @Operation(summary = "Returns all messages")
    public List<Message> getMessages() {
        return messageService.getMessages();
    }
}