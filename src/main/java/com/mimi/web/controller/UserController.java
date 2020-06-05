package com.mimi.web.controller;

import com.mimi.domain.User;
import com.mimi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public  List<User>  findAll(){
      return userService.findAll();
    }
    @RequestMapping("/findById")
    public  User  findById(Integer id){
      User user= userService.findById(id);
        System.out.println(id);
        System.out.println(user);
      return user;
    }
    @RequestMapping("/updateUser")
    public  void  updateUser(@RequestBody User user){
        System.out.println(user);
        System.out.println(user);
        userService.updateUser(user);
    }
}
