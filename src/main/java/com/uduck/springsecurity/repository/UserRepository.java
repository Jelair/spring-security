package com.uduck.springsecurity.repository;

import com.uduck.springsecurity.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByUsername(String username);

}
