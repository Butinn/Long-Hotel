package com.example.LongHotel.repository;

import com.example.LongHotel.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity, Integer> {
    List<RoomEntity> findByStatus(int status);
    List<RoomEntity> findByStatusAndRoomNumber(int status, String roomNumber);

}
