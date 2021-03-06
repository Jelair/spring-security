package com.uduck.springsecurity.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class UserController {

    @GetMapping("/user")
    public String user(@AuthenticationPrincipal Principal principal, Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        model.addAttribute("username", principal.getName());
        model.addAttribute("auth",auth.getAuthorities());
        return "user/user";
    }
}
