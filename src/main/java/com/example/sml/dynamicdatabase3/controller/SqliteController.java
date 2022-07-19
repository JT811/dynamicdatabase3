package com.example.sml.dynamicdatabase3.controller;

import com.example.sml.dynamicdatabase3.entity.User;
import com.example.sml.dynamicdatabase3.service.LibraryService;
import com.example.sml.dynamicdatabase3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SqliteController {

    @Autowired
    LibraryService libraryService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/my", method = RequestMethod.GET)
    public String mydata() {
        int i = libraryService.totalCount();
        return i+"";
    }
    @RequestMapping(value = "/lite", method = RequestMethod.GET)
    public String mydata2() {
        int i = userService.totalCount();
        return i+"";
    }
    @RequestMapping(value = "/lite1", method = RequestMethod.GET)
    public String mydata3() {
        List<User> users = userService.allUsers();
        users.forEach(System.out::println);
        return users.size()+"";
    }
}
