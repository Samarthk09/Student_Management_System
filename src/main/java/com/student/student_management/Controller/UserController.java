package com.student.student_management.Controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/current-user")
    public String getCurrentUser() {
        return SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getName();
    }
}
