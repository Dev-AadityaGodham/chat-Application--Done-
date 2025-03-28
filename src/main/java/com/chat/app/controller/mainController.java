package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @MessageMapping("/sendMessage") // Receives messages from clients
    @SendTo("/topic/messages") // Sends messages to all subscribers
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    @GetMapping("chat") // Serves the Thymeleaf HTML page
    public String chat() {
        return "chat"; // This must match the name of your HTML file inside `src/main/resources/templates/`
    }
}
