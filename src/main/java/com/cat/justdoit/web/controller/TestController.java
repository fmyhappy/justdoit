package com.cat.justdoit.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cat.justdoit.mapper.UserMapper;

import java.io.IOException;

@Controller
public class TestController {
	@Autowired
	private UserMapper mapper;
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@RequestMapping("/haha")
	public void Test1(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("=====123=========");
		try {
			response.getWriter().print("1111111111");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@RequestMapping("/json")
	public void Test2(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("==============");
		try {
			response.getWriter().print("json");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@RequestMapping("/mobile/haha")
	public void Test3(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("======mobile========");
		try {
			response.getWriter().print("mobilehaha");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
