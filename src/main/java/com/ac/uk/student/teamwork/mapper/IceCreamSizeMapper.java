package com.ac.uk.student.teamwork.mapper;

import com.ac.uk.student.teamwork.pojo.IceCream;
import com.ac.uk.student.teamwork.pojo.IceCreamSize;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IceCreamSizeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IceCreamSize record);

    List<IceCreamSize> selectAll(int pagenumber, int pagesize);

    int insertSelective(IceCreamSize record);

    IceCreamSize selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IceCreamSize record);

    int updateByPrimaryKey(IceCreamSize record);
}