package com.example.mini_pro.User.User;


import com.example.mini_pro.Subway.FacilityInfo.FacilityEntity;
import jdk.jshell.spi.ExecutionControl;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserDto {
    private Integer idx;
    private String id;
    private String pwd;
    private String email;
    public UserDto(UserEntity entity) {
        this.idx = entity.getIdx();
        this.id = entity.getId();
        this.pwd = entity.getPwd();
        this.email = entity.getEmail();
    }
}