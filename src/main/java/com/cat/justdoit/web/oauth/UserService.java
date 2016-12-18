package com.cat.justdoit.web.oauth;

import com.cat.justdoit.domain.user.User;
import com.cat.justdoit.entity.WdcyUserDetails;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cat.justdoit.mapper.UserMapper;

import java.util.Collection;
import java.util.List;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		
	
		User user = userMapper.loadByUserName(username);
		if (user ==null) {
			        throw new BadCredentialsException("用户" + username + " 不存在");
		}
		List<GrantedAuthority> authorities = (List<GrantedAuthority>) new WdcyUserDetails(user).getAuthorities();
		System.out.println(authorities);
		System.out.println("------------00000000000000000000000");

		return new WdcyUserDetails(user);
	}

}
