package com.ac.uk.student.teamwork.service;

import com.ac.uk.student.teamwork.pojo.IceCreamSize;

import java.util.List;


/**
 * @description: The methods bridging the front-end and back-end service interface IceCreamSizeService
 * @author: Peter
 * @date:2021-2-28
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
public interface IceCreamSizeService {
    int deleteByPrimaryKey(Integer id);

    int insert(IceCreamSize record);

    List<IceCreamSize> selectAll(int pagenumber, int pagesize);

    int insertSelective(IceCreamSize record);

    IceCreamSize selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IceCreamSize record);

    int updateByPrimaryKey(IceCreamSize record);
}
