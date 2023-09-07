package com.example.demo.representation.dto.converter;

import com.example.demo.data.model.User;
import com.example.demo.representation.dto.UserDto;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverterImpl implements UserDtoConverter{
    @Override
    public UserDto toUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFio(user.getFio());
        userDto.setEmail(user.getEmail());
        userDto.setPhoneNumber(user.getPhoneNumber());
        userDto.setPassportNumber(user.getPassportNumber());
        return userDto;
    }

    @Override
    public User toUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setFio(userDto.getFio());
        user.setEmail(userDto.getEmail());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setPassportNumber(userDto.getPassportNumber());
        return user;
    }
}
