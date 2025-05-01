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
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long userId;

    private String userName;

    private String userLoginId;

    private String userPassword;

    private String userProfileImg;

    private String userEmail;

    private String userPhoneNum;

    private LocalDate userDOB;

    private boolean isHost;

    private LocalDate registerDate;

    private Enum userGender;

    private boolean isCertificate;
}
