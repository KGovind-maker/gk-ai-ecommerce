package com.gk.ai_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.ai_service.webclient.WebClientConfig;

@RestController
@RequestMapping("/ai")
public class AIController {

    @Autowired
    private WebClientConfig webClient;

    @PostMapping("/chat")
    public String chat(@RequestBody String input) {
        return "AI Response for: " + input;
    }
}