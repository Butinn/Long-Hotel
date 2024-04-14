package org.example.service;

import org.example.DTO.LoginDTO;
import org.example.entity.RoomEntity;
import org.example.entity.UserEntity;

import java.util.List;

public interface RoomService {
    List<RoomEntity> getAllRoom();

    List<RoomEntity> getRoom(int status, String roomNumber);

    void addRoom(RoomEntity roomEntity);

    void deleteRoom(Integer roomId);

    void editRoom(RoomEntity roomEntity);
}
