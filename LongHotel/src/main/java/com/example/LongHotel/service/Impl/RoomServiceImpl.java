package com.example.LongHotel.service.Impl;

import com.example.LongHotel.entity.RoomEntity;
import com.example.LongHotel.repository.RoomRepository;
import com.example.LongHotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
