package com.example.sml.dynamicdatabase3.mapper;

import com.example.sml.dynamicdatabase3.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    int totalCount();
   List<User> allUsers();
}
