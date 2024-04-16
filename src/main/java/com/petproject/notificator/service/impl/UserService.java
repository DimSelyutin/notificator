package com.petproject.notificator.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petproject.notificator.entity.User;
import com.petproject.notificator.repository.UserRepository;
import com.petproject.notificator.service.IUserService;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;


    public void setUserRepository(UserRepository userRepository) {
        
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        
        return userRepository.save(user);
    }

    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User findUserByName(String name) {
        return userRepository.findByUsername(name);
    }
}