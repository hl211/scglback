package com.hl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_person_price")
public class TPersonPrice implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long priceId;

    @OneToOne
    @JoinColumn(name = "shopId")
    //商品价格
    private TShop shopId;

    //商品价格
    private double price;
    //地址
    private String marketName;
    //发布时间
    private String creTime;
    //受欢迎程度
    private long likeNum;
    //状态
    @Column(columnDefinition="int default 1",nullable=false)
    private int status;
}
