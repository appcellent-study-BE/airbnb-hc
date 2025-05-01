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
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REVIEW_ID")
    private Long reviewId;

    @ManyToOne
    private Room roomId;

    @ManyToOne
    private Member userId;

    private float averageRating;

    private String review;

    private LocalDateTime reviewDate;

    private float ratingClean;

    private float ratingAccuracy;

    private float ratingCheckIn;

    private float ratingConversation;

    private float ratingLocation;

    private float ratingPrice;
}
