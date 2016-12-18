package com.test;

import com.cat.justdoit.domain.user.User;
import com.cat.justdoit.entity.WdcyUserDetails;
import com.cat.justdoit.mapper.UserMapper;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by FMY on 2016/12/6 0006.
 */
@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/context.xml","classpath*:/spring/security.xml",
        "classpath*:/spring/transaction.xml"})
public class TestMybatis {
    @Autowired
    private UserMapper userMapper;

    @org.junit.Test
    public void test1(){

        User unity = userMapper.getUserByName("unity");
        WdcyUserDetails userDetails = new WdcyUserDetails(unity);
        System.out.println(userDetails.getAuthorities());

    }
}
