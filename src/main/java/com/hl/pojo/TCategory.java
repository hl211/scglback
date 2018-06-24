package com.hl.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * 商品的类别
 */
@Data
@Entity
@Table(name = "t_category")
public class TCategory implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long categoryId;

    //类别名称
    private String categoryName;
    /**
     * 0表示不可用
     */
    @Column(columnDefinition="int default 1",nullable=false)
    private int status;

}
