package com.ac.uk.student.teamwork.service;

import com.ac.uk.student.teamwork.pojo.IceCream;

import java.util.List;

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
