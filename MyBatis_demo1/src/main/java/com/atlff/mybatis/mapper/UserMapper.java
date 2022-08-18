package com.atlff.mybatis.mapper;

import com.atlff.mybatis.pojo.User;

import java.util.List;

/**
 * @author lifeifan
 * @Description
 * @create 2022-08-17 21:29
 */
public interface UserMapper {
    /*
    * 添加用户信息
    */
    int insertUser();

    /*
     * 修改用户信息
    */
    int updateUser();

    /*
    * 删除用户信息
    * */
    int deleteUser();

    /*
    * 根据id查询用户信息
    * */
    User getUserById();

    /*
    * 查询所有用户信息
    * */
    List<User> getAllUser();
}
