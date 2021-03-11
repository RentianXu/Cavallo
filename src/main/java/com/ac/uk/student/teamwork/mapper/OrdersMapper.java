package com.ac.uk.student.teamwork.mapper;
import com.ac.uk.student.teamwork.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;



import java.util.List;

/**
 * @description: Mapper mapping class for database access
 * @author: Rex
 * @date: 2021-3-11
 * @reviewer: Rentian
 * @date: 2021-3-11
 * @version: 1.0
 */

@Mapper
@Repository
public interface OrdersMapper {

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
