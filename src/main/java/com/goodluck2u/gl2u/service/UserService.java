package com.goodluck2u.gl2u.service;

import com.goodluck2u.gl2u.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User userLogin(String openId, String username);
}
