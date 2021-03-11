package com.ac.uk.student.teamwork.service.Impl;

import com.ac.uk.student.teamwork.mapper.CustomerMapper;
import com.ac.uk.student.teamwork.pojo.Customer;
import com.ac.uk.student.teamwork.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: The methods bridging the front-end and back-end service interface CustomerService
 * @author: Andrew
 * @date:2021-2-26
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> findAll() {
        return customerMapper.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerMapper.findById(id);
    }

    @Override
    public Customer loginCustomer(Customer customer) {
        return customerMapper.loginCustomer(customer);
    }

    @Override
    public void registerCustomer(Customer customer) {
        customerMapper.registerCustomer(customer);

    }

    @Override
    public void updateCustomerPassword(Customer customer) {
        customerMapper.updateCustomerPassword(customer);
    }
}
