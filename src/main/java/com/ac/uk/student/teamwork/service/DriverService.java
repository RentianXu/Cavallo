package com.ac.uk.student.teamwork.service;

import com.ac.uk.student.teamwork.pojo.Driver;

import java.util.List;


/**
 * @description: The methods bridging the front-end and back-end service interface DriverService
 * @author: Peter
 * @date:2021-2-28
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
public interface DriverService {
    int deleteByPrimaryKey(Integer id);

    int insert(Driver record);

    int insertSelective(Driver record);

    Driver selectByPrimaryKey(Integer id);

    List<Driver> selectAll(int pagenumber, int pagesize);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKey(Driver record);


}
