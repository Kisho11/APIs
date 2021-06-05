package com.grokonez.jwtauthentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class UserController {

    @Autowired
    private UserDetailsService userService;

    @PostMapping
    public User create(@RequestBody User user){
        return UserDetailsService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public User findOne(@PathVariable("id") int id){
        return UserDetailsService.findById(id);
    }

    @PutMapping
    public User update(@RequestBody User User){
        return UserDetailsService.update(user);
    }

    @DeleteMapping(path = {"/{id}"})
    public User delete(@PathVariable("id") int id){
        return UserDetailsService.delete(id);
    }

    @GetMapping
    public List findAll(){
        return UserDetailsService.findAll();
    }
}
