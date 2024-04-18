package com.example.LongHotel.service;

import com.example.LongHotel.DTO.LoginDTO;
import com.example.LongHotel.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserEntity> getAllUser();

    List<UserEntity> getUser(String name);

    void insertUser(UserEntity userEntity);

    void deleteUser(Integer userId);

    void updateUser(UserEntity userEntity);

    UserEntity login(LoginDTO loginDTO);

    void editUser(UserEntity userEntity);
}
