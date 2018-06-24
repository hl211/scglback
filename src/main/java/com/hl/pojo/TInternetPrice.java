package com.hl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_internet_price")
public class TInternetPrice implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long priceId;

    @OneToOne
    @JoinColumn(name = "shopId")
    //商品价格
    private TShop shopId;

    //商品价格
    private double price;

    //市场名
    private String marketName;

    //发布时间
    private String creTime;

    //状态
    @Column(columnDefinition="int default 1",nullable=false)
    private int status;
}
