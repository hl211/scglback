package com.hl.mapper;

import com.hl.pojo.TUserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<TUserInfo,Long> {
    /**通过username查找用户信息;*/
//    public TUserInfo findBy(String username);
}