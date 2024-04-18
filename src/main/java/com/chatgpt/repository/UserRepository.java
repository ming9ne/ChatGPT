package com.chatgpt.repository;

import com.chatgpt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByIdAndPassword(String id, String password);

}
