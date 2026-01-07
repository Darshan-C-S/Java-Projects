package com.example.lambda.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Message entity")
public class Message {
    private int id;
    private String content;

    public Message() {}

    public Message(int id, String content) {
        this.id = id;
        this.content = content;
    }

    @Schema(description = "Unique ID of the message")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Schema(description = "Message content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
