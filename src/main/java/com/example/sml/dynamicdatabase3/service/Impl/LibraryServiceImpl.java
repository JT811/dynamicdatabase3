package com.example.sml.dynamicdatabase3.service.Impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.sml.dynamicdatabase3.mapper.LibraryMapper;
import com.example.sml.dynamicdatabase3.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements LibraryService {
    @Autowired
    LibraryMapper libraryMapper;

    @Override
   @DS("master")
    public int totalCount() {
        return libraryMapper.totalCount();
    }
}
