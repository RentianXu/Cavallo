package com.ac.uk.student.teamwork.service.Impl;

import com.ac.uk.student.teamwork.mapper.DriverMapper;
import com.ac.uk.student.teamwork.pojo.Driver;
import com.ac.uk.student.teamwork.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverMapper driverMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return driverMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Driver record) {
        return driverMapper.insert(record);
    }

    @Override
    public int insertSelective(Driver record) {
        return driverMapper.insertSelective(record);
    }

    @Override
    public Driver selectByPrimaryKey(Integer id) {
        return driverMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Driver> selectAll(int pagenumber, int pagesize) {
        return driverMapper.selectAll(pagenumber,pagesize);
    }

    @Override
    public int updateByPrimaryKeySelective(Driver record) {
        return driverMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Driver record) {
        return driverMapper.updateByPrimaryKey(record);
    }

}
