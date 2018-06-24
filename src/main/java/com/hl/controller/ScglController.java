package com.hl.controller;

import com.hl.service.UserInfoService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ScglController {
    private final static Logger logger = LoggerFactory.getLogger(ScglController.class);

    @Resource
    private UserInfoService userInfoService;

    //获取我的关注
    @ApiOperation(value="获取我的关注", notes="根据获取用户详细信息")
    @RequestMapping(value = "user",method = RequestMethod.GET)
    public void get_guanzhu() {

    }
}
