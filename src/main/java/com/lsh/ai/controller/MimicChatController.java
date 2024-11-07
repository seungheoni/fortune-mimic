package com.lsh.ai.controller;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MimicChatController {

    private final OllamaChatModel chatModel;

    @Autowired
    public MimicChatController(OllamaChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/chat")
    public String chat() {
        // 기본 메시지 설정
        String message = "오늘의 운세 한줄로 얘기해줘";

        // Ollama 모델에서 응답을 가져옴
        String response = chatModel.call(message);

        // 조작된 응답 반환
        return response;
    }
}