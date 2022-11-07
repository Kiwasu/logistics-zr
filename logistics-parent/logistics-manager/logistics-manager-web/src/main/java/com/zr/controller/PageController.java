package com.zr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zr
 * @Date: 2022/11/4-11-04-10:12
 * @Description: com.zr.controller
 * @Version: 1.0
 */
@Controller
public class PageController {
    /**
     * 请求路径为 http://ip:port/项目上下文/ 或者 http://ip:port/项目上下文/home，则显示主页 /WEB-INF/jsp/main.jsp
     * 前后缀在applicationContext-base.xml中配置
     * @return
     */
    @RequestMapping({"/", "/home"})
    public String showMain(){
        return "main";
    }

    /**
     * 请求路径为 http://ip:port/项目上下文/path，则显示页面 /WEB-INF/jsp/path.jsp，其中path代表任意字符串
     * @param path
     * @return
     */
    @RequestMapping("/{path}")
    public String showPage(@PathVariable String path){
        return path;
    }

}
