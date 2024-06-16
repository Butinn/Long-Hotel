package com.example.LongHotel.controller;

import com.example.LongHotel.entity.Appointment;
import com.example.LongHotel.entity.RoomEntity;
import com.example.LongHotel.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping("/get-all-appointment")
    public List<Appointment> getAllAppointment() {
        return appointmentService.getAllAppointment();
    }

    @GetMapping("/get-appointment/{userId}")
    public List<Appointment> getAppointment(@PathVariable Integer userId) {
         return appointmentService.getAppointmentByUserId(userId);
    }

    @GetMapping("/get-appointment-by-userid-and-status/{userId}/{status}")
    public List<Appointment> getAppointmentByUseridAndStatus(@PathVariable Integer userId, @PathVariable Integer status) {
        return appointmentService.getAppointmentByUserIdAndStatus(userId, status);
    }

    @GetMapping("/get-appointment-by-roomid-and-status/{roomId}/{status}")
    public Appointment getAppointmentByRoomIdAndStatus(@PathVariable Integer roomId, @PathVariable Integer status) {
        return appointmentService.getAppointmentByRoomIdAndStatus(roomId, status);
    }

    @GetMapping("/get-appointment-number/{roomNumber}")
    public Appointment getAppointment(@PathVariable String roomNumber) {
        return appointmentService.getAppointmentByRoomNumber(roomNumber);
    }

    @PostMapping("/create-appointment")
    public Appointment insertAppointment(@RequestBody Appointment appointment) {
        appointmentService.createAppointment(appointment);
        return appointment;
    }

    @DeleteMapping("/delete/{appointmentId}")
    public void clearAppointment(@PathVariable Integer appointmentId) {
        appointmentService.clearAppointment(appointmentId);
    }

    @PutMapping("/edit/{appointmentId}")
    public void editAppointment(@PathVariable Integer appointmentId) {
        appointmentService.editAppointment(appointmentId);
    }
}
