package com.example.mini_pro.Bus.BusInfo;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BusInfoDto {

    private Integer busInfo_code;
    private String busInfo_nm;
    private Integer busInfo_total;

    public BusInfoDto(BusInfoEntity entity) {
        this.busInfo_code = entity.getBusInfo_code();
        this.busInfo_nm = entity.getBusInfo_nm();
        this.busInfo_total = entity.getBusInfo_total();
    }
}
