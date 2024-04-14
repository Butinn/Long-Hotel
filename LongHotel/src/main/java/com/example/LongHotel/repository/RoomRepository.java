package com.example.LongHotel.repository;

import com.example.LongHotel.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<RoomEntity, Integer> {
    List<RoomEntity> findByStatus(int status);

}
