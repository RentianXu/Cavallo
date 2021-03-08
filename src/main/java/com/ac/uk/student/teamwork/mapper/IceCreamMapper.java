package com.ac.uk.student.teamwork.mapper;

import com.ac.uk.student.teamwork.pojo.Driver;
import com.ac.uk.student.teamwork.pojo.IceCream;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @description: Mapper mapping class for database access
 * @author: Peter
 * @date:
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
@Mapper
@Repository
public interface IceCreamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IceCream record);

    int insertSelective(IceCream record);

    List<IceCream> selectAll(int pagenumber, int pagesize);

    IceCream selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IceCream record);

    int updateByPrimaryKey(IceCream record);
}