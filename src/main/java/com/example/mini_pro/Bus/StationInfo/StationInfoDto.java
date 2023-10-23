package com.example.mini_pro.Bus.StationInfo;

import com.example.mini_pro.Bus.StationInfo.StationInfoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StationInfoDto {

    private Integer stationInfo_code;
    private  Integer stationInfo_ars;
    private String stationInfo_nm;
    private Double stationInfo_lng;
    private Double stationInfo_lat;

    public StationInfoDto(StationInfoEntity entity) {
        this.stationInfo_code = entity.getStationInfo_code();
        this.stationInfo_ars = entity.getStationInfo_ars();
        this.stationInfo_nm = entity.getStationInfo_nm();
        this.stationInfo_lat = entity.getStationInfo_lat();
        this.stationInfo_lng = entity.getStationInfo_lng();
    }
}