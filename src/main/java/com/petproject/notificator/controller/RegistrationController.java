package com.petproject.notificator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.petproject.notificator.entity.User;

import com.petproject.notificator.service.impl.UserService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping("/auth")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "register";
    }
   

    @PostMapping("/register")
    public String processRegistrationForm(@ModelAttribute("user") User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            // Обработка ошибок валидации, если есть
            return "registration";
        }

        // Добавление нового пользователя в базу данных
        userService.createUser(user);

        return "Registration successful";
    }

}
