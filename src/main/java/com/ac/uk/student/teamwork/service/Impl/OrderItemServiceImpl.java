package com.ac.uk.student.teamwork.service.Impl;


import com.ac.uk.student.teamwork.mapper.OrderItemMapper;
import com.ac.uk.student.teamwork.pojo.OrderItem;
import com.ac.uk.student.teamwork.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: Bridging the front-end and back-end service class OrderItemImpl
 * @author: Retnian
 * @date:2021-2-28
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    private  OrderItemMapper orderItemMapper;


    @Override
    public void addCart(OrderItem orderItem) {
        orderItemMapper.addCart(orderItem);
    }

    @Override
    public List<OrderItem> listOrderItemByOrderId(int order_id) {
        return orderItemMapper.listOrderItemByOrderId(order_id);
    }
}
