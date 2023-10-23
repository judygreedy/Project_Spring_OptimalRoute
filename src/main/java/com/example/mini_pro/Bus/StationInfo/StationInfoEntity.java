package com.example.mini_pro.Bus.StationInfo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Table(name = "stataionInfo")
@Entity
public class StationInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stationInfo_code;
    private Integer stationInfo_ars;
    private String stationInfo_nm;
    private Double stationInfo_lng;
    private Double stationInfo_lat;

}
