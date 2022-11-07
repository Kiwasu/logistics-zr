package com.zr.service.impl;

import com.zr.mapper.UserMapper;
import com.zr.pojo.User;
import com.zr.pojo.UserExample;
import com.zr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: zr
 * @Date: 2022/11/7-11-07-10:57
 * @Description: com.zr.service.impl
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> query(User user) {
        UserExample userExample = new UserExample();
        //对userExample的设置。。。
        return userMapper.selectByExample(userExample);
    }

    @Override
    public Integer add(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public Integer update(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public Integer remove(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }
}
