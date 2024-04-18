package com.example.LongHotel.service.Impl;

import com.example.LongHotel.entity.Appointment;
import com.example.LongHotel.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Override
    public List<Appointment> getAllAppointment() {
        return null;
    }

    @Override
    public void createAppointment(Appointment appointment) {

    }

    @Override
    public void clearAppointment(Integer appointmentId) {

    }

    @Override
    public void editAppointment(Appointment appointment) {

    }
}
