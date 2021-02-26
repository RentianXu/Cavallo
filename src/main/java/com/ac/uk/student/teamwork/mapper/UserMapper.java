package com.ac.uk.student.teamwork.mapper;

import com.ac.uk.student.teamwork.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
* @description: The mapping class Mapper that accesses the database
* @author:Rentian
* @date: 2021-2-23
* @version: 1.0
*/
@Mapper
@Repository
public interface UserMapper {
    //Query all user information
    List<User> findAll();
    //Query records by user name
    User findByUserName(String userName);
    //Login user
    User loginUser(User user);
    //Register user
    void registUser(User user);
    //Change user password
    void updateUserPassword(User user);
}
