package com.mimi.service;

import com.mimi.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户
     */
    List<User> findAll();

    /**
     * 通过查询一个用户
     */
    User findById(Integer id);

    /**
     * 修改用户
     */
     void updateUser(User user);
}
