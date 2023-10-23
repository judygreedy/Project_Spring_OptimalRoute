package com.example.mini_pro.User.LikePlace;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LikePlaceDto {
    private Integer user_idx;
    private Double lat;
    private Double lng;
    private String name;

    public LikePlaceDto(LikePlaceEntity entity){
        this.user_idx = entity.getUser_idx();
        this.lat = entity.getLat();
        this.lng = entity.getLng();
        this.name = entity.getName();
    }

}
