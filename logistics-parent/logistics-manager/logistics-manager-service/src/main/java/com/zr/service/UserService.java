package com.zr.service;

import com.zr.pojo.User;

import java.util.List;

/**
 * @Author: zr
 * @Date: 2022/11/7-11-07-10:56
 * @Description: com.zr.service
 * @Version: 1.0
 */
public interface UserService {
    List<User> query(User user);
    Integer add(User user);
    Integer update(User user);
    Integer remove(Integer userId);
}
