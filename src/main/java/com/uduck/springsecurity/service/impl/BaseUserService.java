package com.uduck.springsecurity.service.impl;

import com.uduck.springsecurity.constant.RoleConstant;
import com.uduck.springsecurity.entity.User;
import com.uduck.springsecurity.repository.UserRepository;
import com.uduck.springsecurity.service.UserService;
import com.uduck.springsecurity.util.PasswordEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseUserService implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean insert(User user) {
        String username = user.getUsername();
        if (exist(username))
            return false;
        user.setPassword(PasswordEncoderUtil.passwordEncoder(user.getPassword()));
        user.setRoles(RoleConstant.ROLE_USER);
        User save = userRepository.save(user);
        return save != null;
    }

    @Override
    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    private boolean exist(String username){
        User user = userRepository.findByUsername(username);
        return (user != null);
    }
}
