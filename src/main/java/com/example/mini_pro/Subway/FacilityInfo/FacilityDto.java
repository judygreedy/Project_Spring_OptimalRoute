package com.example.mini_pro.Subway.FacilityInfo;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FacilityDto {
    private String facilityInfo_ev;
    private String facilityInfo_wh;
    private String facilityInfo_parking;
    private String facilityInfo_complain;
    private String facilityInfo_exchange;
    private String facilityInfo_train;
    private String facilityInfo_culture;
    private String facilityInfo_meeting;
    private String facilityInfo_kids;
    private String facilityInfo_sub;

    public FacilityDto(FacilityEntity entity) {
        this.facilityInfo_ev = entity.getFacilityInfo_ev();
        this.facilityInfo_wh = entity.getFacilityInfo_wh();
        this.facilityInfo_parking = entity.getFacilityInfo_parking();
        this.facilityInfo_complain = entity.getFacilityInfo_complain();
        this.facilityInfo_exchange = entity.getFacilityInfo_exchange();
        this.facilityInfo_train = entity.getFacilityInfo_train();
        this.facilityInfo_culture = entity.getFacilityInfo_culture();
        this.facilityInfo_meeting = entity.getFacilityInfo_meeting();
        this.facilityInfo_kids = entity.getFacilityInfo_kids();
        this.facilityInfo_sub = entity.getFacilityInfo_sub();
    }
}
