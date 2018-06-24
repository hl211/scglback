package com.hl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_province")
public class TProvince implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long provinceId;
    //类别名称
    private String provinceName;
    //状态
    @Column(columnDefinition="int default 1",nullable=false)
    private int status;
}
