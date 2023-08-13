package com.hoangtien2k3.mapper;

import com.hoangtien2k3.dto.UserDTO;
import com.hoangtien2k3.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {
    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDTO mapToUserDto(User user); // map User -> UserDTO

    User mapToUser(UserDTO userDto); // map UserDTO -> User
}
