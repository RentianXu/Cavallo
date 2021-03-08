package com.ac.uk.student.teamwork.mapper;

import com.ac.uk.student.teamwork.pojo.OrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: Mapper mapping class for database access
 * @author: Rentian
 * @date: 2021-3-6
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
@Mapper
@Repository
public interface OrderItemMapper {
    void addCart(OrderItem orderItem);

    void remove(int icecream_id);

    List<OrderItem> listOrderItemByOrderId(int order_id);


}
