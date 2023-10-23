package com.example.mini_pro.Subway.SubInfo;


import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SubInfoDto {

    private String subInfo_code;
    private String subInfo_nm;
    private String subInfo_ho;
    private String subInfo_code_extra;
    public SubInfoDto(SubInfoEntity entity) {
        this.subInfo_code = entity.getSubInfo_code();
        this.subInfo_nm = entity.getSubInfo_nm();
        this.subInfo_ho = entity.getSubInfo_ho();
        this.subInfo_code_extra = entity.getSubInfo_code_extra();
    }
}
