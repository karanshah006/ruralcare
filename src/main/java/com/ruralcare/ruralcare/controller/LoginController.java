package com.ruralcare.ruralcare.controller;

import com.ruralcare.ruralcare.model.LoginRequest;
import com.ruralcare.ruralcare.model.User;
import com.ruralcare.ruralcare.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private final UserRepository userRepository;

    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public String login(@RequestBody LoginRequest request) {

        User user = userRepository.findAll()
                .stream()
                .filter(u -> u.getPhone().equals(request.getPhone())
                        && u.getPassword().equals(request.getPassword()))
                .findFirst()
                .orElse(null);

        if (user != null) {
            return "Login successful! Welcome to RuralCare, " + user.getName() + ".";
        }

        return "Invalid phone number or password.";
    }
}