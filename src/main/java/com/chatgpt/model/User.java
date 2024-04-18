package com.chatgpt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    private String id;
    private String username;
    private String phone;
    private String password;
    private String role;

    // 생성자, getter 및 setter 생략
}