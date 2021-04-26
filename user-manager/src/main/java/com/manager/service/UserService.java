package com.manager.service;


import model.manager.user.User;

import java.util.List;

/**
 * @author 10281
 * @title 人员业务层
 * @Date 2020-11-21 0:36
 * @Description 人员业务层
 */
public interface UserService {

    /**
     * 获取所有人员信息
     * @return  人员集合
     */
    List<User> getAllUser();

    /**
     * 新增人员
     * @param user  人员
     * @return  返回受影响行数
     */
    Long addUser(User user);

    /**
     * 根据ID删除User
     * @param id
     * @return
     */
    int deleteUserById(Long id);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 通过id获取用户
     * @param id
     * @return
     */
    User getUserById(Long id);

}
