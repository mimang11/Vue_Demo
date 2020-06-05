package com.mimi.service.impl;

import com.mimi.dao.UserMapper;
import com.mimi.domain.User;
import com.mimi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);

    }
}
