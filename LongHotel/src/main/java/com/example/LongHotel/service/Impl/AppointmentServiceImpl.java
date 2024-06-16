package com.example.LongHotel.service.Impl;

import com.example.LongHotel.entity.Appointment;
import com.example.LongHotel.entity.RoomEntity;
import com.example.LongHotel.repository.AppointmentRepository;
import com.example.LongHotel.repository.RoomRepository;
import com.example.LongHotel.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAllAppointment() {
        return appointmentRepository.findAll();
    }

    @Override
    public void createAppointment(Appointment appointment) {
        appointment.setStatus(0);
        appointmentRepository.save(appointment);
    }

    @Override
    public void clearAppointment(Integer appointmentId) {
        appointmentRepository.deleteById(appointmentId);
    }

    @Override
    public void editAppointment(Integer appointmentParam) {
        Optional<Appointment> optional = appointmentRepository.findById(appointmentParam);
        if (optional.isEmpty())
            throw new RuntimeException();
        else{
            Appointment app = optional.get();
            app.setStatus(1);

            appointmentRepository.save(app);
        }
    }

    @Override
    public List<Appointment> getAppointmentByUserId(Integer userId) {
        return appointmentRepository.findByUserId(userId);
    }

    @Override
    public Appointment getAppointmentByRoomNumber(String roomNumber) {
        return appointmentRepository.findByRoomNumber(roomNumber);
    }

    @Override
    public List<Appointment> getAppointmentByUserIdAndStatus(Integer userId, Integer status) {
        return appointmentRepository.findByUserIdAndStatus(userId, status);
    }

    @Override
    public Appointment getAppointmentByRoomIdAndStatus(Integer roomId, Integer status) {
        return appointmentRepository.findByRoomIdAndStatus(roomId, status);
    }
}
