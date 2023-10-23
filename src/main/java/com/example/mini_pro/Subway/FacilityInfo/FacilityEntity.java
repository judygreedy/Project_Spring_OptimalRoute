package com.example.mini_pro.Subway.FacilityInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Table(name = "facilityInfo")
@Entity
public class FacilityEntity {
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
}
