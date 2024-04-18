package com.example.LongHotel.controller;

import com.example.LongHotel.entity.Appointment;
import com.example.LongHotel.entity.RoomEntity;
import com.example.LongHotel.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/appointment")
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
    public List<Appointment> getAppointment(@PathVariable String userId) {
        return null;
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

    @PutMapping("/edit")
    public void editAppointment(@RequestBody Appointment appointment) {
        appointmentService.editAppointment(appointment);
    }

}
