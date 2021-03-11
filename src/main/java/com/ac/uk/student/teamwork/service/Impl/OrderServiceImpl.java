package com.ac.uk.student.teamwork.service.Impl;

import com.ac.uk.student.teamwork.mapper.OrdersMapper;
import com.ac.uk.student.teamwork.pojo.Orders;
import com.ac.uk.student.teamwork.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @description: Bridging the front-end and back-end service class OrderServiceImpl
 * @author: Rentian
 * @date:2021-3-10
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> findAll() {
        return ordersMapper.findAll();
    }

    @Override
    public Orders selectByPrimaryKey(Integer id) {
        return ordersMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Orders> findByCustomerId(Integer customerId) {
        return ordersMapper.findByCustomerId(customerId);
    }

    @Override
    public int createOrder(Orders orders) {
        return ordersMapper.createOrder(orders);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ordersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateOrderType(Integer id, Integer order_type) {
        ordersMapper.updateOrderType(id,order_type);
    }


}
