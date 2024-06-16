package com.example.LongHotel.repository;

import com.example.LongHotel.entity.Appointment;
import com.example.LongHotel.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    List<Appointment> findByUserId(int id);

    Appointment findByRoomNumber(String roomNumber);

    List<Appointment> findByUserIdAndStatus(Integer userId, Integer status);

    Appointment findByRoomIdAndStatus(Integer roomId, Integer status);
}
