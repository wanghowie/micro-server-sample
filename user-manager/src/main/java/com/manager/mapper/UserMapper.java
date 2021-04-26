package com.manager.mapper;

import model.manager.user.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 10281
 * @title User持久层
 * @Date 2020-11-20 23:42
 * @Description
 */
@Mapper
public interface UserMapper {

    /**
     * 获取所有人员
     * @return  人员集合
     */
    @Select("select id, user_name as userName,pwd from user")
    List<User> getAllUser();

    /**
     * 新增人员 @Options设置返回主键
     * @param user  人员
     * @return  返回受影响行数
     */
    @Insert("insert into user (user_name,pwd) values (#{userName},#{pwd})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Long addUser(User user);

    /**
     * 根据ID删除User
     * @param id 主键
     * @return 返回受影响行数
     */
    @Delete("delete from user where id = #{id}")
    int deleteUserById(Long id);

    /**
     * 更新用户
     * @param user
     * @return
     */
    @Update("update user set user_name = #{userName},pwd = #{pwd} where id = #{id}")
    int updateUser(User user);

    /**
     * 通过id获取用户
     * @param id
     * @return
     */
    @Select("select  id, user_name as userName,pwd from user where id = #{id}")
    User getUserById(Long id);

}
