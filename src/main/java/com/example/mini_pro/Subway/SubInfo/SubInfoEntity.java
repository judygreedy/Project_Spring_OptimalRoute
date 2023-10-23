package com.example.mini_pro.Subway.SubInfo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Table(name = "subInfo")
@Entity
public class SubInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String subInfo_code;
    private String subInfo_nm;
    private String subInfo_ho;
    private String subInfo_code_extra;
}
