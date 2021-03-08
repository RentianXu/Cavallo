package com.ac.uk.student.teamwork;

import com.ac.uk.student.teamwork.info.ResultInfo;
import com.ac.uk.student.teamwork.mapper.IceCreamMapper;
import com.ac.uk.student.teamwork.mapper.OrderItemMapper;
import com.ac.uk.student.teamwork.mapper.StaffMapper;
import com.ac.uk.student.teamwork.mapper.UserMapper;
import com.ac.uk.student.teamwork.pojo.IceCream;
import com.ac.uk.student.teamwork.pojo.OrderItem;
import com.ac.uk.student.teamwork.pojo.Staff;
import com.ac.uk.student.teamwork.pojo.User;
import com.ac.uk.student.teamwork.service.Impl.IceCreamServiceImpl;
import com.ac.uk.student.teamwork.service.Impl.OrderItemServiceImpl;
import com.ac.uk.student.teamwork.service.Impl.StaffServiceImpl;
import com.ac.uk.student.teamwork.service.Impl.UserServiceImpl;
import com.ac.uk.student.teamwork.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    StaffMapper staffMapper;

    @Autowired
    StaffServiceImpl staffServiceImpl;

    @Autowired
    OrderItemMapper orderItemMapper;

    @Autowired
    OrderItemServiceImpl orderItemServiceImpl;



    @Test
    void testLogin() {
//        User user = new User();
//        user.setUserName("test");
//        user.setUserPassword("123");
//        ResultInfo user1 = userService.loginUser(user);
//        System.out.println(user1);
//        IceCream iceCream = new IceCream(1,"tub","12",0.0,"middle",1);
//        iceCreamServiceImpl.insert(iceCream);
//
//        iceCreamServiceImpl.updateByPrimaryKey(iceCream);
//        System.out.println(iceCream);





//        Staff staff = new Staff(1,"Rentian","111");
//        staffServiceImpl.registerStaff(staff);
//        Staff staff1 = staffServiceImpl.findByStaffName("Rentian");
//        System.out.println(staff1);

//        Staff staff2 = staffServiceImpl.loginStaff(staff);
//        System.out.println(staff2);

//        staffServiceImpl.updateStaffPassword(staff);
//        Staff staff3 = staffServiceImpl.findByStaffName("Rentian");
//        System.out.println(staff3);

//        OrderItem orderItem = new OrderItem(1,1,3,1,30);
//        orderItemServiceImpl.addCart(orderItem);

       List<OrderItem> arrayList = orderItemServiceImpl.listOrderItemByOrderId(3);
        System.out.println(arrayList);

    }
}
