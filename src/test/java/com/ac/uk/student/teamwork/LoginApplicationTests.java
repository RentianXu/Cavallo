package com.ac.uk.student.teamwork;

import com.ac.uk.student.teamwork.info.ResultInfo;
import com.ac.uk.student.teamwork.mapper.IceCreamMapper;
import com.ac.uk.student.teamwork.mapper.UserMapper;
import com.ac.uk.student.teamwork.pojo.IceCream;
import com.ac.uk.student.teamwork.pojo.User;
import com.ac.uk.student.teamwork.service.Impl.IceCreamServiceImpl;
import com.ac.uk.student.teamwork.service.Impl.UserServiceImpl;
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
    UserServiceImpl userServiceImpl;

    @Autowired
    IceCreamMapper iceCreamMapper;

    @Autowired
    IceCreamServiceImpl iceCreamServiceImpl;

    @Test
    void testLogin() {
//        User user = new User();
//        user.setUserName("test");
//        user.setUserPassword("123");
//        ResultInfo user1 = userService.loginUser(user);
//        System.out.println(user1);
        IceCream iceCream = new IceCream(1,"tub","11",0.0,"middle",1);
        iceCreamServiceImpl.insert(iceCream);

    }
}
