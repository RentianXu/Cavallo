package com.ac.uk.student.teamwork.service;


import com.ac.uk.student.teamwork.pojo.Customer;

import java.util.List;

/**
 * @description: The methods bridging the front-end and back-end service interface CustomerService
 * @author: Andrew
 * @date:2021-2-26
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
public interface CustomerService {

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
