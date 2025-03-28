package com.chat.app.model;

import java.awt.*;

public class ChatMessage {
    private String content;
    private String sender;
    private TrayIcon.MessageType type;

    public ChatMessage() {} // No-arg constructor required

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public TrayIcon.MessageType getType() {
        return type;
    }

    public void setType(TrayIcon.MessageType type) {
        this.type = type;
    }
}
