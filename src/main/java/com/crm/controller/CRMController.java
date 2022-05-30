package com.crm.controller;

import com.alibaba.fastjson.JSONObject;
import com.crm.entity.UserInfo;
import com.crm.service.UserInfoService;
import com.crm.util.EncryptUtil;
import com.crm.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/myDB")
public class CRMController {

    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private EncryptUtil encryptUtil;
    @Autowired
    private TokenUtil tokenUtil;

    @RequestMapping("/regist")
    public int regist(@RequestBody UserInfo userInfo){
        return userInfoService.addUser(userInfo);
    }

    @RequestMapping("user/login")
    public String login(@RequestBody UserInfo userInfo){
//        Map<String,Object> map = new HashMap<String,Object>();
        JSONObject jsonObject=new JSONObject();
        System.out.println(userInfo.getUserid() +"========="+userInfo.getPassword());
        try{
            UserInfo user= userInfoService.selectUser(userInfo.getUserid());
            System.out.println(user.getUserid() +"========="+user.getPassword()+"========"+user.getUsername());
            if(user != null && user.getPassword().equals(encryptUtil.md5AndSha(userInfo.getPassword()))){
                if("0".equals(user.getStatus())){
                    jsonObject.put("status","200");;;
                    jsonObject.put("data",user);
                    jsonObject.put("token",tokenUtil.token(user.getUserid(),user.getPassword()));
                    jsonObject.put("statusText","验证通过，登录成功！");
                }else{
                    jsonObject.put("status","0");
                    jsonObject.put("data",user);
                    jsonObject.put("msg","账户已被锁定！");
                }
            }else{
                jsonObject.put("status","0");
                jsonObject.put("data",user);
                jsonObject.put("msg","密码不正确！");

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return jsonObject.toJSONString();
    }


}
