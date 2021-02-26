package com.ac.uk.student.teamwork.conroller;

import com.ac.uk.student.teamwork.info.ResultInfo;
import com.ac.uk.student.teamwork.pojo.User;
import com.ac.uk.student.teamwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
* @description: The Controller layer interacting with the front end，UserController
* @author: Rentian
* @date:2021-2-23
* @version: 1.0
*/
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * Register
     * @param user
     * @return Feedback information
     */
    @PostMapping(value = "/regist")
    public ResultInfo regist(User user){
        return userService.registUser(user);
    }

    /**
     * login
     * @param user
     * @return Feedback information
     */
    @PostMapping(value = "/login")
    public ResultInfo login(User user){
        return userService.loginUser(user);
    }

    /**
     * update the password
     * @param user
     * @return Feedback information
     */
    @PostMapping(value = "/updateUserPassword")
    public ResultInfo updateUserPassword(User user){
        return userService.updateUserPassword(user);
    }
}
