package org.example.service.Impl;

import org.example.DTO.LoginDTO;
import org.example.entity.RoomEntity;
import org.example.entity.UserEntity;
import org.example.repository.RoomRepository;
import org.example.repository.UserRepository;
import org.example.service.RoomService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<RoomEntity> getAllRoom() {
        return roomRepository.findAll();
    }

    @Override
    public List<RoomEntity> getRoom(int status, String roomNumber) {
        return null;
    }

    @Override
    public void addRoom(RoomEntity roomEntity) {

    }

    @Override
    public void deleteRoom(Integer roomId) {

    }

    @Override
    public void editRoom(RoomEntity roomEntity) {

    }
}
