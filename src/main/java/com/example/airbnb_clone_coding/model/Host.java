package com.example.airbnb_clone_coding.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class Host {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HOST_ID")
    private Long hostId;

    @OneToOne
    private Member userId;

    private LocalDate hostDate;

    private boolean isEmail;

    private boolean isPhoneNum;
}
