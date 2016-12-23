package com.cat.justdoit.web.controller.api;

import com.cat.justdoit.domain.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by FMY on 2016/12/20 0020.
 */
@RestController("api/v1.0")
public class APIController {

    @RequestMapping(value = "/testapi",method = RequestMethod.GET,produces="application/json")
    public User test1(HttpServletRequest request, HttpServletResponse response) {
        User user = new User("123", "234", "456", "789");
        return user;

    }
}
