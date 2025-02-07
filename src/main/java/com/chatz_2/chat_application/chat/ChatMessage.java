package com.chatz_2.chat_application.chat;

import com.chatz_2.chat_application.controller.entity.MessageType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType messageType;
}
