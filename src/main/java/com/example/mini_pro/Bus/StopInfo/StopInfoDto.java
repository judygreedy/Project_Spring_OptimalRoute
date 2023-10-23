package com.example.mini_pro.Bus.StopInfo;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StopInfoDto {
    //DTO에서 사용할 필드(엔티티에서 불러오는 것)
    private Integer stopInfo_pnum;
    private  Integer stopInfo_bus;
    private String stopInfo_station;

    //엔티티에서 필드값을 불러옴
    public StopInfoDto(StopInfoEntity entity) {
        this.stopInfo_pnum = entity.getStopInfo_pnum();
        this.stopInfo_bus = entity.getStopInfo_bus();
        this.stopInfo_station = entity.getStopInfo_station();
    }
}
