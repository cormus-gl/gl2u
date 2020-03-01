package com.goodluck2u.gl2u.controller;

import com.alibaba.fastjson.JSONObject;
import com.goodluck2u.gl2u.common.WXbizDataCrypt;
import com.goodluck2u.gl2u.entity.User;
import com.goodluck2u.gl2u.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    public String test(){
        return "123";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public User userLogin(@RequestParam(name = "sessionKey")String sessionKey, @RequestParam(name = "encryptedData")String encryptedData, @RequestParam(name = "iv")String iv){
        RestTemplate restTemplate = new RestTemplate();
        WXbizDataCrypt pc = new WXbizDataCrypt("", sessionKey);
        Map<String, Object> resMap = pc.decrypt(encryptedData, iv);
        if (resMap == null){
            return null;
        }
        return userService.userLogin((String)resMap.get("openid"), (String)resMap.get("username"));
    }

}
