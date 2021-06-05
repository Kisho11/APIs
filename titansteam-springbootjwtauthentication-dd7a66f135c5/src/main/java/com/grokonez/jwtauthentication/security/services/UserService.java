package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    @Transactional
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    User create(User user);

    User delete(int id);

    List findAll();

    User findById(int id);

    User update(User user);
}
