package com.example.demo.domain.service;

import com.example.demo.data.model.User;
import com.example.demo.representation.dto.UserDto;

public interface UserService {
    UserDto addUser(UserDto userDto);
    String getUserNameByPhoneNumber(String phoneNumber);
}
