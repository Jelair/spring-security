package com.uduck.springsecurity.service;

import com.uduck.springsecurity.entity.User;

public interface UserService {

    boolean insert(User user);

    User getByUsername(String username);
}
