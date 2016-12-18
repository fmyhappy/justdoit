package com.test;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class Test {
public static void main(String[] args) {
	Md5PasswordEncoder md5 = new Md5PasswordEncoder(); 
	String result = md5.encodePassword("123","002");
	System.out.println(result);
}
}
