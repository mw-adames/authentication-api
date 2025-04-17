package com.misael.authenticationapi.controller;


import com.misael.authenticationapi.entities.User;
import com.misael.authenticationapi.repository.UserRepository;
import com.misael.authenticationapi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping(value = "/api")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public User create(User user) {
        User resur = userService.create(user.getFullName(),user.getPassword(),user.getEmail());
        return resur;
    }
    @GetMapping
    public List<User> findAll() {
       List<User> resur =   this.userService.findAll();
        return resur;
    }


}
