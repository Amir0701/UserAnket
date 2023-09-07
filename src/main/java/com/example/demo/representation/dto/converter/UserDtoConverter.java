package com.example.demo.representation.dto.converter;

import com.example.demo.data.model.User;
import com.example.demo.representation.dto.UserDto;

public interface UserDtoConverter {
    UserDto toUserDto(User user);
    User toUser(UserDto userDto);
}
