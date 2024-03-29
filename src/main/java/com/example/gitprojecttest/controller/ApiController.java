package com.example.gitprojecttest.controller;

import com.example.gitprojecttest.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PostMapping("/user")
    public Object user() {
        User user = new User();
        user.getEmail();
        user.getAge();
        user.getName();
        user.getPhoneNumber();
        // git rebase test005
        System.out.println(user.toString());
        return user;
    }
}
