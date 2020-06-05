package com.mimi;

import com.mimi.domain.User;
import com.mimi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class springTest {
    @Autowired
    private UserService userService;
    @Test
    public void test1(){
        List<User> all = userService.findAll();
        System.out.println(all);
    }
    @Test
    public  void  test2(){
        User byId = userService.findById(2);
        System.out.println(byId);
    }

    @Test
    public  void  test3(){
        User byId = userService.findById(1);
        System.out.println("修改前"+byId);
        byId.setAge(550);
        userService.updateUser(byId);
        User byId1 = userService.findById(1);
        System.out.println("修改后"+byId1);
    }
}
