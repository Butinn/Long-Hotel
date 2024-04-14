package org.example.service;

import org.example.DTO.LoginDTO;
import org.example.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUser();

    List<UserEntity> getUser(String name);

    void insertUser(UserEntity userEntity) ;

    void deleteUser(Integer userId);

    void updateUser(UserEntity userEntity);

    UserEntity login(LoginDTO loginDTO);

    void editUser(UserEntity userEntity);
}
