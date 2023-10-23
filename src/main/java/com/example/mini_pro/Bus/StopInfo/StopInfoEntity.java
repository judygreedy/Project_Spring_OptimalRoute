package com.example.mini_pro.Bus.StopInfo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Table(name = "stopInfo")
@Entity
public class StopInfoEntity {

    private Integer stopInfo_pnum;
    private Integer stopInfo_bus;
    private String stopInfo_station;

}
