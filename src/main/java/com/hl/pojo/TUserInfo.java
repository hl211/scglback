package com.hl.pojo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "t_userinfo")
public class TUserInfo implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long userId;
    private String openId;
    //    用户昵称
    private String nickName;
    //    用户头像
    private String avatarUrl;
    //    用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
    private String gender;
    //    用户所在城市
    private String city;
    //    用户所在省份
    private String province;
    //    用户所在省份
    private String country;
    //用户状态
    @Column(columnDefinition="int default 1",nullable=false)
    private int status;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name = "t_user_shop", joinColumns = { @JoinColumn(name = "userId") }, inverseJoinColumns = {
            @JoinColumn(name = "shopId") })
    private Set<TShop> tshops;



}
