package com.example.airbnb_clone_coding.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESERVATION_ID")
    private Long reservationId;

    @ManyToOne
    private Member userId;

    @ManyToOne
    private Room roomId;

    private LocalDateTime checkInDate;

    private LocalDateTime checkOutDate;

    private String status;

    private int adults;

    private int children;

    private int infants;

    private int pets;
}
