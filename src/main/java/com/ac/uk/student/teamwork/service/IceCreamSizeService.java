package com.ac.uk.student.teamwork.service;

import com.ac.uk.student.teamwork.pojo.IceCreamSize;

import java.util.List;

public interface IceCreamSizeService {
    int deleteByPrimaryKey(Integer id);

    int insert(IceCreamSize record);

    List<IceCreamSize> selectAll(int pagenumber, int pagesize);

    int insertSelective(IceCreamSize record);

    IceCreamSize selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IceCreamSize record);

    int updateByPrimaryKey(IceCreamSize record);
}
