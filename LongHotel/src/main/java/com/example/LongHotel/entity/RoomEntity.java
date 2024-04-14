package com.example.LongHotel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "room")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "room_number")
    private String roomNumber;

    @Column(name = "status") // 0: empty 1: reserve
    private int status;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "price")
    private double price;

    @Column(name = "note")
    private String note;
}
