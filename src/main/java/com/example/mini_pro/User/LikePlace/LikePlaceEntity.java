package com.example.mini_pro.User.LikePlace;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Table(name = "likePlace")
@Entity
public class LikePlaceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_idx;
    private Double lat;
    private Double lng;
    private String name;
}
