package com.example.LongHotel.service;

import com.example.LongHotel.entity.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AppointmentService {

    List<Appointment> getAllAppointment();

    void createAppointment(Appointment appointment);

    void clearAppointment(Integer appointmentId);

    void editAppointment(Appointment appointment);
}
