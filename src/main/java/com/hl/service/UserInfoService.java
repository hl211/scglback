package com.hl.service;

import com.hl.pojo.TUserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public TUserInfo findByUsername(String username);
}