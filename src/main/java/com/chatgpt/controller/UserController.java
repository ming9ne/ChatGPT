package com.chatgpt.controller;

import com.chatgpt.model.User;
import com.chatgpt.repository.UserRepository;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class UserController {



    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/login")
    @ResponseBody
    public ResponseEntity<String> login(@RequestBody User user, HttpServletResponse response) {
        // 사용자 이름과 비밀번호로 사용자 조회
        User matchedUser = userRepository.findByIdAndPassword(user.getId(), user.getPassword());


        if (matchedUser != null) {
            // 로그인 성공 시 메인 페이지로 리디렉션
            response.setHeader("Location", "/main");
            return ResponseEntity.status(HttpStatus.FOUND).body("로그인 성공");
        } else {
            // 로그인 실패
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("로그인 실패");
        }
    }

    @GetMapping("/api/userInfo")
    public User getCurrentUser(HttpSession session) {
        return (User) session.getAttribute("loggedInUser");
    }


}