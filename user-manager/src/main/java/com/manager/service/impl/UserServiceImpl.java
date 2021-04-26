package com.manager.service.impl;

import com.manager.mapper.UserMapper;
import com.manager.service.UserService;
import model.manager.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 10281
 * @title 人员业务实现类
 * @Date 2020-11-21 0:48
 * @Description 人员业务实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Cacheable(value = "userCacheable",key = "'user:'")
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public Long addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUserById(Long id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public int updateUser(User user) {
        assert user.getId() != null && user.getId() > 0L;
        return userMapper.updateUser(user);
    }

    @Cacheable(value = "userCacheable",key = "'user:' + #id")
    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
