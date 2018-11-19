package com.uduck.springsecurity.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderUtil {

    private static PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public static String passwordEncoder(String password){
        return passwordEncoder.encode(password);
    }
}
