package com.chatz_2.chat_application.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class webSocketEventListner {
    @EventListener
    public void handleWebsocketDisconnectListner(SessionDisconnectEvent event){

    }
}
