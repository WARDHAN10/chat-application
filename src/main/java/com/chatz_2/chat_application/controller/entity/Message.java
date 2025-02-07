package com.chatz_2.chat_application.controller.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Entity
@Data
@Builder
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private MessageType type;
    private String creator;

    public Message(Long id, String content, MessageType type, String creator) {
        this.id = id;
        this.content = content;
        this.type = type;
        this.creator = creator;
    }
}
