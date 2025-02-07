package com.chatz_2.chat_application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Chat {

    @GetMapping
    public ResponseEntity<String> getMethod(){
        return ResponseEntity.ok("Sneha");
    }


}
