package com.mimi.dao;

import com.mimi.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/*
* 用户接口
* */
public interface UserMapper {

    /**
     * 查询所有用户
     */
@Select("select * from user")
    List<User> findAll();

    /**
     * 通过查询一个用户
     */
    @Select("select * from user where id = #{id}")
    User findById(Integer id);

    /**
     * 修改用户
     */
    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void updateUser(User user);

}
