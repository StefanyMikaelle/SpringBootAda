package com.api.SpringBootADA.controller;

import com.api.SpringBootADA.entity.UserEntity;
import com.api.SpringBootADA.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> list(){
        return userService.userEntityList();
    }

    @GetMapping("{id}")
    public UserEntity getOne(@PathVariable Long id) {
        return userService.userEntityOne(id);
    }

    @PostMapping("")
    public UserEntity save(@RequestBody UserEntity user) {
        return userService.userEntitySave(user);
    }

    @PatchMapping("{id}")
    public UserEntity update(@PathVariable Long id, @RequestBody UserEntity user) {
        return userService.userEntityUpdate(id, user);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }

}
