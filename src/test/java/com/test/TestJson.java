package com.test;

import com.cat.justdoit.domain.user.User;
import com.cat.justdoit.entity.WdcyUserDetails;
import com.cat.justdoit.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/context.xml","classpath*:/spring/security.xml",
		"classpath*:/spring/transaction.xml"})
public class TestJson {
	@Autowired
	private UserMapper userMapper;

 
	@Test
	public void TestToken(){
//		util.refreshToken("222");
	}
	@Test
	public void test2(){
//		User user= userMapper.getUserByName("admin");
//		System.out.println(user);

	}

}
