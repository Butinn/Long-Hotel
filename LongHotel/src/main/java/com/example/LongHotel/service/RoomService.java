package com.example.LongHotel.service;

import com.example.LongHotel.entity.RoomEntity;

import java.util.List;

public interface RoomService {
    List<RoomEntity> getAllRoom();

    List<RoomEntity> getRoom(int status, String roomNumber);

    void addRoom(RoomEntity roomEntity);

    void deleteRoom(Integer roomId);

    void editRoom(RoomEntity roomEntity);
}
