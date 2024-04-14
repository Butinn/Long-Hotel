package org.example.controller;

import org.example.DTO.LoginDTO;
import org.example.entity.RoomEntity;
import org.example.entity.UserEntity;
import org.example.service.RoomService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/get-all-room")
    public List<RoomEntity> getAllRoom() {
        return roomService.getAllRoom();
    }

    @GetMapping("/get-room/{room-number}")
    public List<RoomEntity> getRoom(@PathVariable String name) {
        return null;
    }


    @PostMapping("/add-room")
    public RoomEntity insertRoom(@RequestBody RoomEntity roomEntity) {
        roomService.addRoom(roomEntity);
        return roomEntity;
    }

    @DeleteMapping("/delete/{room-number}")
    public void deleteRoom(@PathVariable Integer roomId) {
        roomService.deleteRoom(roomId);
    }

    @PutMapping("/edit")
    public void editRoom(@RequestBody RoomEntity roomEntity) {
        roomService.editRoom(roomEntity);
    }
}
