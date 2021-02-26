package com.ac.uk.student.teamwork;

import com.ac.uk.student.teamwork.info.ResultInfo;
import com.ac.uk.student.teamwork.mapper.UserMapper;
import com.ac.uk.student.teamwork.pojo.User;
import com.ac.uk.student.teamwork.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class

LoginApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;
    @Test
    void testLogin() {
        User user = new User();
        user.setUserName("test");
        user.setUserPassword("123");
        ResultInfo user1 = userService.loginUser(user);
        System.out.println(user1);
    }
}
