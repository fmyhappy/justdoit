package com.cat.justdoit.web.controller.mobile;

import org.springframework.context.annotation.Role;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by FMY on 2016/12/5 0005.
 */

@Controller
@RequestMapping("/m")
public class TestMobileController {

    @RequestMapping("/haha123")
    public void test12233(){
        System.out.println("进入了=======");
        show();
    }

    public void show(){
        System.out.println("========进入了mobile测试控制器=======");

    }
}
