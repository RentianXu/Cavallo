package com.ac.uk.student.teamwork.service;

import com.ac.uk.student.teamwork.pojo.Orders;

import java.util.List;

/**
 * @description: The methods bridging the front-end and back-end service interface OrderService
 * @author: Rentian
 * @date:2021-3-10
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
public interface OrderService {

    //Query all order information
    List<Orders> findAll();

    //Find order information by id
    Orders selectByPrimaryKey(Integer id);

    //Use customerId to find order information
    List<Orders> findByCustomerId(Integer customer_id);

    //Create Order
    int createOrder(Orders orders);

    //Delete order based on id
    int deleteByPrimaryKey(Integer id);

    //Change order status
    void updateOrderType(Integer id, Integer order_type);

}
