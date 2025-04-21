package com.example.userapi.repository;

import com.example.userapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>
{
    User findbyUsername(String username);
}
