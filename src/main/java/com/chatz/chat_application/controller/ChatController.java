package com.chatz.chat_application.controller;

import com.chatz.chat_application.repository.MessageRepository;

@Autowired
private MessageRepository messageRepository;

@MessageMapping("/chat")
@SendTo("/topic/messages")
public ChatMessage sendMessage(ChatMessage message) {
    messageRepository.save(message);
    return message;
}