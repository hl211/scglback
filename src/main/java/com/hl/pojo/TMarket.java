package com.hl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_market")
public class TMarket implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long marketId;

    //市场名
    private String marketName;

    @OneToOne
    @JoinColumn(name = "provinceId")
    private TProvince tProvince;

}
