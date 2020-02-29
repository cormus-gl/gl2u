package com.goodluck2u.gl2u.service.serviceImpl;

import com.goodluck2u.gl2u.dao.UserMapper;
import com.goodluck2u.gl2u.entity.User;
import com.goodluck2u.gl2u.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;


public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User userLogin(String openId, String username) {
        User user = userMapper.selectByPrimaryKey(openId);
        if (user == null){
            user = new User(openId, username, 10000, new Date(), new Date());
        }
        return user;
    }
}
