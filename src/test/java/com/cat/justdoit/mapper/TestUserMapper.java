package com.cat.justdoit.mapper;

import com.cat.justdoit.domain.user.User;
import com.test.JUnit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by FMY on 2016/12/18 0018.
 */
@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/context.xml","classpath*:/spring/security.xml",
        "classpath*:/spring/transaction.xml"})
public class TestUserMapper {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1(){
//        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
//        String password = encoder.encodePassword("123", "");
//
//        User user = new User("007",password,"123456","@1232");
//        user.archived(true);
////
//        userMapper.saveUser(user);

    }
}
