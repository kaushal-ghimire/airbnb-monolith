package com.airbnb.airbnb_monolith.service;


import com.airbnb.airbnb_monolith.model.User;
import com.airbnb.airbnb_monolith.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public String register(User user) {
        userRepository.save(user);
        return "User registered successfully";
    }

    public String login(User user) {
        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null
                ? "Login successful"
                : "Invalid credentials";
    }
}