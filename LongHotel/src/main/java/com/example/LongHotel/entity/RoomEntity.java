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
    private Integer status;

    @Column(name = "room_type")//1: phòng đơn 2: phòng đôi
    private Integer roomType;

    @Column(name = "price")
    private Double price;

    @Column(name = "note")
    private String note;

    @Column(name = "feature")
    private String feature;

    @Column(name = "description")
    private String description;
}
