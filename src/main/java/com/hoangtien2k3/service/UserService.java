package com.hoangtien2k3.service;

import com.hoangtien2k3.dto.UserDTO;
import com.hoangtien2k3.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO user);
    UserDTO getUserById(Long userId);
    List<UserDTO> getAllUsers();
    UserDTO updateUser(UserDTO user);
    void deleteUser(Long userId);
}
