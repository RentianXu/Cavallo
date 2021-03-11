package com.ac.uk.student.teamwork.mapper;

import com.ac.uk.student.teamwork.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @description Customer entity mapper
 * @author Andrew Faber
 * @date 26/02/2021 16:35
 * @reviewer Rentian
 * @date 9/3/2021
 * @version 1.0
 */

@Mapper
@Repository
public interface CustomerMapper {
    List<Customer> findAll();
    /**
     *
     * @return List of all registered Customers
     */
    Customer findById(Integer id);
    /**
     *
     * @param id Integer, a customers unique id
     * @return Customer coresponding to the entered id
     */
    Customer loginCustomer(Customer customer);
    /**
     * Registers a new customer
     * @param customer a new customer
     */
    void registerCustomer(Customer customer);
    /**
     * changes the password of an existing customer
     * @param customer an existing customer
     */
    void updateCustomerPassword(Customer customer);
}
