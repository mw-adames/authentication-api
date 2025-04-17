package com.misael.authenticationapi.service;


import com.misael.authenticationapi.entities.User;
import com.misael.authenticationapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(String username, String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setFullName(username);
        user.setEmail(email);
        User savedUser = userRepository.save(user);
        return savedUser;
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }



}
