package com.example.LongHotel.service.Impl;

import com.example.LongHotel.entity.RoomEntity;
import com.example.LongHotel.repository.RoomRepository;
import com.example.LongHotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<RoomEntity> getAllRoom() {
        return roomRepository.findAll();
    }

    @Override
    public List<RoomEntity> getRoom(int status, String roomNumber) {
        return roomRepository.findByStatusAndRoomNumber(status, roomNumber);
    }

    @Override
    public void addRoom(RoomEntity roomEntity) {
        roomEntity.setStatus(0);
        roomRepository.save(roomEntity);
    }

    @Override
    public void deleteRoom(Integer roomId) {
        roomRepository.deleteById(roomId);
    }

    @Override
    public void editRoom(RoomEntity roomParam) {
        Optional<RoomEntity> optional = roomRepository.findById(roomParam.getId());
        if (optional.isEmpty()) {
            throw new RuntimeException();
        } else {
            RoomEntity room = optional.get();
            if (roomParam.getRoomNumber() != null) {
                room.setRoomNumber(roomParam.getRoomNumber());
            }
            if (roomParam.getNote() != null) {
                room.setNote(roomParam.getNote());
            }
            if (roomParam.getRoomType() != null) {
                room.setRoomType(roomParam.getRoomType());
            }
            if (roomParam.getPrice() != null) {
                room.setPrice(roomParam.getPrice());
            }
            if (roomParam.getStatus() != null){
                room.setStatus(roomParam.getStatus());
            }
            if (roomParam.getFeature() != null){
                room.setFeature(roomParam.getFeature());
            }
            if (roomParam.getDescription() != null){
                room.setDescription(roomParam.getDescription());
            }

            roomRepository.save(room);
        }
    }
}
