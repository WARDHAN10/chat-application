package com.chatz_2.chat_application.config;

import com.chatz_2.chat_application.chat.ChatMessage;
import com.chatz_2.chat_application.controller.entity.MessageType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class webSocketEventListner {
    public final SimpMessageSendingOperations messageTemplate;
    @EventListener
    public void handleWebsocketDisconnectListner(SessionDisconnectEvent event){
        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
        String username =(String) headerAccessor.getSessionAttributes().get("username");
        if(username != null){
            log.info("user disconnect :{}",username);
            var chatMessage = ChatMessage.builder()
                    .messageType(MessageType.LEAVE)
                    .sender(username)
                    .build();
            messageTemplate.convertAndSend("/topic/public",chatMessage);
        }
    }
}
