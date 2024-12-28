package com.chatz.chat_application.entity;


@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sender;
    private String content;
    private String timestamp;

    // Getters and setters
}
Z