package com.cat.justdoit.mapper;

import com.cat.justdoit.domain.user.User;
import org.springframework.stereotype.Repository;

import com.cat.justdoit.entity.WdcyUserDetails;

@Repository
public interface UserMapper {
    public User loadByUserName(String username);
}
