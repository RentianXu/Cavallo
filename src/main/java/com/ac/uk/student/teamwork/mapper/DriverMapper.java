package com.ac.uk.student.teamwork.mapper;

import com.ac.uk.student.teamwork.pojo.Driver;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DriverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Driver record);

    int insertSelective(Driver record);

    Driver selectByPrimaryKey(Integer id);

    List<Driver> selectAll(int pagenumber,int pagesize);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKey(Driver record);
}