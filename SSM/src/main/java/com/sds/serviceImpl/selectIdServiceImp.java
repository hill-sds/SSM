package com.sds.serviceImpl;

import com.sds.mapper.userMapper;
import com.sds.service.selectIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class selectIdServiceImp implements selectIdService {

    @Autowired
    userMapper userMapper;

    @Override
    public int selectId() {
        return userMapper.selectId();
    }
}
