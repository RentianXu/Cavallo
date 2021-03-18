package com.ac.uk.student.teamwork;

import com.ac.uk.student.teamwork.mapper.*;
import com.ac.uk.student.teamwork.pojo.*;
import com.ac.uk.student.teamwork.service.Impl.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
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

    @Autowired
    CustomerMapper customerMapper;

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @Autowired
    OrdersMapper ordersMapper;

    @Autowired
    OrderServiceImpl orderServiceImpl;


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





        Staff staff = new Staff(2,"yutong","222");
        staffServiceImpl.registerStaff(staff);
//        Staff staff1 = staffServiceImpl.findByStaffName("Rentian");
//        System.out.println(staff1);

//        Staff staff2 = staffServiceImpl.loginStaff(staff);
//        System.out.println(staff2);

//        staffServiceImpl.updateStaffPassword(staff);
//        Staff staff3 = staffServiceImpl.findByStaffName("Rentian");
//        System.out.println(staff3);

//        OrderItem orderItem = new OrderItem(1,1,3,1,30);
//        orderItemServiceImpl.addCart(orderItem);

//        List<OrderItem> arrayList = orderItemServiceImpl.listOrderItemByOrderId(3);
//        System.out.println(arrayList);

//        Calendar calendar = Calendar.getInstance();
//        calendar.set(2020,5,5,12,5,44);
//          Calendar calendar = Calendar.getInstance();
//          calendar.set(2020,3,4,6,7,50);
//          Orders order = new Orders(4,1,1,"NE4 5SF","RRVV", calendar.getTime(),1,"sc");
//          Orders orders = orderServiceImpl.selectByPrimaryKey(3);
//          System.out.println(orders);
//          orderServiceImpl.createOrder(order);
//        orderServiceImpl.deleteByPrimaryKey(4);


      orderServiceImpl.updateOrderType(1,3);



    }
}
