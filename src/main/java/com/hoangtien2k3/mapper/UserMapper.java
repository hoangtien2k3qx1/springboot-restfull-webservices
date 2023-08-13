package com.hoangtien2k3.mapper;

import com.hoangtien2k3.dto.UserDTO;
import com.hoangtien2k3.entity.User;

public class UserMapper {
    public static UserDTO mapToUserDto(User user){  // Convert User JPA Entity into UserDto
        UserDTO userDto = new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }

    public static User mapToUser(UserDTO userDto){  // Convert UserDto into User JPA Entity
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
    }
}
