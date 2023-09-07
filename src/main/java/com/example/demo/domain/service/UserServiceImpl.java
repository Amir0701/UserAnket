package com.example.demo.domain.service;

import com.example.demo.data.model.User;
import com.example.demo.data.repository.UserRepository;
import com.example.demo.representation.dto.UserDto;
import com.example.demo.representation.dto.converter.UserDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final UserDtoConverter userDtoConverter;

    @Autowired
    public UserServiceImpl(
            UserRepository userRepository,
            UserDtoConverter userDtoConverter
    ){
        this.userRepository = userRepository;
        this.userDtoConverter = userDtoConverter;
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = userDtoConverter.toUser(userDto);
        System.out.println(user.getFio());
        System.out.println(user.getEmail());
        User addedUser = userRepository.saveAndFlush(user);
        return userDtoConverter.toUserDto(addedUser);
    }

    @Override
    public String getUserNameByPhoneNumber(String phoneNumber) {
        User user = userRepository.findByPhoneNumber(phoneNumber);
        if(user != null){
            return user.getFio();
        }
        return "Такого номера нет";
    }
}
