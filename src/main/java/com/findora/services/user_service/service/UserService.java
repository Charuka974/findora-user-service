package com.findora.services.user_service.service;

import com.findora.services.user_service.dto.LoginRequest;
import com.findora.services.user_service.dto.UserRequest;
import com.findora.services.user_service.dto.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    UserResponse login(LoginRequest request);

    UserResponse getUserById(Long id);

    List<UserResponse> getAllUsers();

    UserResponse updateUser(Long id, UserRequest request);

    void deleteUser(Long id);
}
