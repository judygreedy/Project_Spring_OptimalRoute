package com.example.mini_pro.Bus.BusInfo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Table(name = "busInfo")
@Entity
public class BusInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer busInfo_code;

    @Column(length=50, nullable = false)
    private String busInfo_nm;
    private Integer busInfo_total;
}
