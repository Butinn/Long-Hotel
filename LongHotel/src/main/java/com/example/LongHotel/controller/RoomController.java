package com.example.LongHotel.controller;

import com.example.LongHotel.entity.RoomEntity;
import com.example.LongHotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/room")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/get-all-room")
    public List<RoomEntity> getAllRoom() {
        return roomService.getAllRoom();
    }

    @GetMapping("/get-room/{roomNumber}/{status}")
    public List<RoomEntity> getRoom(@PathVariable String roomNumber, @PathVariable int status) {
        return roomService.getRoom(status, roomNumber);
    }


    @PostMapping("/add-room")
    public RoomEntity insertRoom(@RequestBody RoomEntity roomEntity) {
        roomService.addRoom(roomEntity);
        return roomEntity;
    }

    @DeleteMapping("/delete/{roomId}")
    public void deleteRoom(@PathVariable Integer roomId) {
        roomService.deleteRoom(roomId);
    }

    @PutMapping("/edit")
    public void editRoom(@RequestBody RoomEntity roomEntity) {
        roomService.editRoom(roomEntity);
    }
}
