package com.example.demo.representation.controller;

import com.example.demo.data.model.User;
import com.example.demo.domain.service.UserService;
import com.example.demo.representation.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/submit")
    ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto){
        return ResponseEntity.ok(userService.addUser(userDto));
    }

    @GetMapping(value = "/fio", params = {"phoneNumber"})
    String getFioByPhoneNumber(@RequestParam String phoneNumber){
        //return ResponseEntity.ok(userService.getUserNameByPhoneNumber(phoneNumber));
        return userService.getUserNameByPhoneNumber(phoneNumber);
    }
}
