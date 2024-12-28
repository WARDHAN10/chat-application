package com.chatz.chat_application.controller;

import com.chatz.chat_application.repository.MessageRepository;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}
