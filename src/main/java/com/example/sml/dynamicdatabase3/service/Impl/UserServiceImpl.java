package com.example.sml.dynamicdatabase3.service.Impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.sml.dynamicdatabase3.entity.User;
import com.example.sml.dynamicdatabase3.mapper.UserMapper;
import com.example.sml.dynamicdatabase3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    @DS("slave_1")
    public int totalCount() {
        return userMapper.totalCount();
    }

    @Override
    @DS("slave_1")
    public List<User> allUsers() {
        return userMapper.allUsers();
    }
}
