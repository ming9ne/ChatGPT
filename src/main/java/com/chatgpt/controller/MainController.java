package com.chatgpt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String mainPage() {
        return "main.html";
    }

    @GetMapping("/")
    public String login() {
        return "index.html";
    }

    @GetMapping("/chat")
    public String chatPage() {
        return "chat.html";
    }

    @GetMapping("/chatLog")
    public String chatLogPage() {
        return "chatLog.html";
    }

    @GetMapping("/success")
    public String success() {
        return "success.html";
    }

    @GetMapping("/upload")
    public String upload() {
        return "upload.html";
    }





//    @GetMapping("/student")
//    public String studentPage() {
//        return "student.html";
//    }
//
//    @GetMapping("/admin")
//    public String adminPage() {
//        return "admin.html";
//    }
}