package com.goodluck2u.gl2u.controller;

import com.alibaba.fastjson.JSONObject;
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

    private static final String WX_LOGIN = "https://api.weixin.qq.com/sns/jscode2session?appid=wxe87a36fae6791225&secret=d9a1ebb0c450641f085e74f38d79897a&grant_type=authorization_code&js_code=";

    @Autowired
    private UserService userService;

    public String test(){
        return "123";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public User userLogin(@RequestParam(name = "code")String code, @RequestParam(name = "username")String username){
        RestTemplate restTemplate = new RestTemplate();
        String res = restTemplate.getForObject(WX_LOGIN, String.class);
        JSONObject jsonObject = JSONObject.parseObject(res);
        Map<String, Object> resMap = (Map<String, Object>) jsonObject;
        int errCode = (Integer) resMap.get("errorcode");
        if (errCode != 0){
            log.error("user login error: " + (String)resMap.get("errmsg"));
            return null;
        }
        return userService.userLogin((String)resMap.get("openid"), username);
    }

}
