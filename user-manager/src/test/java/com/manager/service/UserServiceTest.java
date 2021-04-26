package com.manager.service;

import com.manager.mapper.UserMapper;
import com.netflix.discovery.converters.Auto;
import model.manager.user.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void getAllUser() {
        List<User> userList = userMapper.getAllUser();
        System.out.println(userList.size());
    }

    @Test
    void addUser() {
        User user = User.builder().userName("刘德华").pwd("ldh").build();
        Long resultRows = userMapper.addUser(user);
        System.out.println("影响行数:"+ resultRows);
    }

    @Test
    void deleteUserById() {
        System.out.println(userMapper.deleteUserById(1L));
    }

    @Test
    void updateUser(){
        User updateUser = User.builder().userName("张学友").pwd("zhagnxueyou").id(4L).build();
        System.out.println(userMapper.updateUser(updateUser));
    }
}