package com.example.LongHotel.service;

import com.example.LongHotel.entity.RoomEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {
    List<RoomEntity> getAllRoom();

    List<RoomEntity> getRoom(int status, String roomNumber);

    void addRoom(RoomEntity roomEntity);

    void deleteRoom(Integer roomId);

    void editRoom(RoomEntity roomEntity);
}
