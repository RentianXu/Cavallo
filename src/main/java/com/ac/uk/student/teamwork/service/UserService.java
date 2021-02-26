package com.ac.uk.student.teamwork.service;

import com.ac.uk.student.teamwork.info.ResultInfo;
import com.ac.uk.student.teamwork.mapper.UserMapper;
import com.ac.uk.student.teamwork.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @description: Bridging the front-end and back-end service class UserService
* @author: Rentian
* @date: 2021-2-23
* @version: 1.0
*/
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class UserService {
    @Autowired
    UserMapper userMapper;
    private ResultInfo result = new ResultInfo<>();

    /**
     * Register Service
     * @param user Parameters obtained from the front end
     * @return
     */
    public ResultInfo registUser(User user) {
        try {
            User name = userMapper.findByUserName(user.getUserName());
            if (name != null) {
                result.setMsg("The user already exists. Please select a new username。");
            } else {
                System.out.println(user);
                userMapper.registUser(user);
                result.setMsg("Registration is successful, please return to the login page to login。");
                result.setSuccess(true);
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Login Service
     * @param user Login account
     * @return
     */
    public ResultInfo loginUser(User user) {
        try {
            User userExist = userMapper.loginUser(user);
            if (userExist == null) {
                result.setMsg("Incorrect username or password, please recheck");
            } else {
                result.setMsg("Login successfully。");
                user.setUserId(user.getUserId());
                result.setSuccess(true);
                user = userMapper.findByUserName(user.getUserName());
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public ResultInfo updateUserPassword(User user){
        result.setMsg("Modify successfully");
        result.setSuccess(true);
        result.setDetail(user);
        userMapper.updateUserPassword(user);
        return result;
    }
}
