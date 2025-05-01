package com.example.airbnb_clone_coding.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class WishList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WISH_LIST_ID")
    private Long wishListId;

    @ManyToOne
    private WishListFolder wishListFolderId;

    @ManyToOne
    private Room roomId;
}
