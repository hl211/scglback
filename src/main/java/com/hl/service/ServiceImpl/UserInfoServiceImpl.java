package com.hl.service.ServiceImpl;

import com.hl.mapper.UserInfoDao;
import com.hl.pojo.TUserInfo;
import com.hl.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public TUserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return null;
    }
}
