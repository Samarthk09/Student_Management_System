package com.student.student_management.Controller;

import com.student.student_management.Entity.User;
import com.student.student_management.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {

        if (userRepo.findByEmail(user.getEmail()).isPresent()) {
            return ResponseEntity.badRequest().body("Email already exists");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("USER");

        userRepo.save(user);
        return ResponseEntity.ok("User registered successfully");
    }
}