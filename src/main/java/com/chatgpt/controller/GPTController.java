package com.chatgpt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class GPTController {

    @Value("${openai.secret-key}")
    private String openaiApiKey;

    @PostMapping("/api/v1/completions")
    public ResponseEntity<Map<String, Object>> getCompletions(@RequestBody Map<String, Object> request) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + openaiApiKey);

        HttpEntity<Map<String, Object>> httpEntity = new HttpEntity<>(request, headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map> responseEntity = restTemplate.exchange(
                "https://api.openai.com/v1/completions",
                HttpMethod.POST,
                httpEntity,
                Map.class
        );

        return new ResponseEntity<>(responseEntity.getBody(), HttpStatus.OK);
    }
}