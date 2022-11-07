package com.zr.controller;

import com.zr.pojo.User;
import com.zr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: zr
 * @Date: 2022/11/7-11-07-11:20
 * @Description: com.zr.controller
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public String query(User user, Model model){
        List<User> userList = userService.query(user);
        model.addAttribute("userList", userList);
        return "user/showUser";
    }
}
