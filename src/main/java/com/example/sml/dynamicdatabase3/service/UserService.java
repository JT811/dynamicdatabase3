package com.example.sml.dynamicdatabase3.service;


import com.example.sml.dynamicdatabase3.entity.User;

import java.util.List;

public interface UserService {
    int totalCount();
    List<User> allUsers();
}
