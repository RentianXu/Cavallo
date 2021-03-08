package com.ac.uk.student.teamwork.service;

import com.ac.uk.student.teamwork.mapper.OrderItemMapper;
import com.ac.uk.student.teamwork.pojo.OrderItem;

import java.util.List;

/**
 * @description: The methods bridging the front-end and back-end service interface OrderItemService
 * @author: Rentian
 * @date:2021-2-28
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
public interface OrderItemService {
    void addCart(OrderItem orderItem);

    List<OrderItem> listOrderItemByOrderId(int order_id);
}
