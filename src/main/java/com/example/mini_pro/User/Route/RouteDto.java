package com.example.mini_pro.User.Route;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RouteDto {

    private Integer idx;
    private Double lat;
    private Double lng;
    private String trans;
    private Integer rnumber;

    public RouteDto(RouteEntity entity){
        this.idx = entity.getIdx();
        this.lat = entity.getLat();
        this.lng = entity.getLng();
        this.trans = entity.getTrans();
        this.rnumber =entity.getRnumber();
    }
}
