package com.uduck.springsecurity.controller;

import com.uduck.springsecurity.entity.User;
import com.uduck.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping({"/","/index","/home"})
    public String root(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/register")
    public String doRegister(User user){
        if (userService.insert(user))
            return "redirect:register?success";
        return "redirect:register?error";
    }
}
