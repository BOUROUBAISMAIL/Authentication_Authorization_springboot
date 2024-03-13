package com.ismail.jwt.backend.mappers;

import com.ismail.jwt.backend.dtos.SignUpDto;
import com.ismail.jwt.backend.dtos.UserDto;
import com.ismail.jwt.backend.entites.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
