package com.example.mini_pro.User.Route;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Table(name = "route")
@Entity
public class RouteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private Double lat;
    private Double lng;
    private String trans;
    private Integer rnumber;
}