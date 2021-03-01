package com.ac.uk.student.teamwork.service;

import com.ac.uk.student.teamwork.pojo.Driver;

import java.util.List;

public interface DriverService {
    int deleteByPrimaryKey(Integer id);

    int insert(Driver record);

    int insertSelective(Driver record);

    Driver selectByPrimaryKey(Integer id);

    List<Driver> selectAll(int pagenumber, int pagesize);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKey(Driver record);


}
