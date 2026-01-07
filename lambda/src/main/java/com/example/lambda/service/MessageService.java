package com.example.lambda.service;


import com.example.lambda.model.Message;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private final List<Message> messages = new ArrayList<>();
    private int counter = 1;

    public Message addMessage(String content) {
        Message message = new Message(counter++, content);
        messages.add(message);
        return message;
    }

    public boolean deleteMessage(int id) {
        return messages.removeIf(message -> message.getId() == id);
    }

    public List<Message> getMessages() {
        return messages;
    }
}