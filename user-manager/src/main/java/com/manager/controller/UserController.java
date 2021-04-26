package com.manager.controller;

import com.manager.listener.ServerPortHolderListener;
import com.manager.service.UserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import model.manager.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 10281
 * @title 人员控制层
 * @Date 2020-11-21 0:56
 * @Description 人员控制层
 */
@RestController
@RequestMapping("/user")
@Api
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取所有用户
     * @return 用户集合
     */
    @GetMapping()
    public List<User> getAllUser(){
        ServerPortHolderListener.printPort();
        return userService.getAllUser();
    }

    /**
     * 添加用户
     * @param user  用户
     * @return  正常情况返回true
     */
    @PostMapping()
    public boolean addUser(@RequestBody User user) {
        userService.addUser(user);
        return true;
    }

    /**
     * 更新用户
     * @param user  用户
     * @return  正常情况返回true
     */
    @PutMapping()
    public boolean updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return true;
    }

    /**
     * 根据用户id删除用户
     * @param id    用户id
     * @return    正常情况返回true
     */
    @DeleteMapping("/{id}")
    public boolean deleteUserByUserId(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
        return true;
    }

    /**
     * 根据用户id获取用户数据
     * @param id    用户id
     * @return  用户对象
     */
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }
}
