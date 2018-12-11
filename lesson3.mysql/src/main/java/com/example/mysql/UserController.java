package com.example.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserJPA userJPA;

    @GetMapping(value = "/list")
    public List<UserEntity> list() {
        return userJPA.findAll();
    }

    @GetMapping(value = "/save")
    public UserEntity save(UserEntity userEntity) {
        return userJPA.save(userEntity);
    }

    @GetMapping(value = "/delete")
    public List<UserEntity> delete(Long id) {
        userJPA.deleteById(id);
        return userJPA.findAll();
    }
}
