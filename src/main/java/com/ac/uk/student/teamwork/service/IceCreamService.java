package com.ac.uk.student.teamwork.service;

import com.ac.uk.student.teamwork.pojo.IceCream;

import java.util.List;


/**
 * @description: The methods bridging the front-end and back-end service interface IceCreamService
 * @author: Peter
 * @date:2021-2-28
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
public interface IceCreamService {
    int deleteByPrimaryKey(Integer id);

    int insert(IceCream record);

    int insertSelective(IceCream record);

    List<IceCream> selectAll(int pagenumber, int pagesize);

    IceCream selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IceCream record);

    int updateByPrimaryKey(IceCream record);

    public String writeImg();
}
