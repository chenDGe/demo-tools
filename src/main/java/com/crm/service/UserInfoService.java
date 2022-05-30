package com.crm.service;

import com.crm.dao.UserInfoMapper;
import com.crm.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public int addUser(UserInfo userInfo){
        return userInfoMapper.insert(userInfo);
    }

    public int updateUserByUserid(UserInfo userInfo){
        return userInfoMapper.updateById(userInfo);
    }

    public UserInfo selectUser(String userid){

        return userInfoMapper.selectById(userid);
    }
}
