package com.hl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "t_shop")
public class TShop implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
   private long shopId;
    //商品代码
    private long shopCode;
    //商品名称
   private String shopName;

    //状态
    @Column(columnDefinition="int default 1",nullable=false)
    private int status;


   //商品类别
    @OneToOne
    @JoinColumn(name = "categoryId")
   private TCategory tCategory;




}
