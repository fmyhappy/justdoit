package com.cat.justdoit.web.controller.browser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cat.justdoit.domain.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cat.justdoit.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    private UserMapper usermapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ModelAndView addUser(ModelAndView modelAndView, User user, HttpServletResponse response) {

        User u = usermapper.loadByUserName(user.getUsername());
        if (u == null) {
            usermapper.saveUser(user);
            modelAndView.addObject("result", "注册成功");
        } else {
            modelAndView.addObject("result", "用户已存在");
        }

        modelAndView.setViewName("result");
        return modelAndView;
    }

}
