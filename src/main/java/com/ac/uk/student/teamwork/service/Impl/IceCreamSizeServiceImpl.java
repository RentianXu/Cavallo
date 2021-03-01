package com.ac.uk.student.teamwork.service.Impl;

import com.ac.uk.student.teamwork.mapper.IceCreamSizeMapper;
import com.ac.uk.student.teamwork.pojo.IceCreamSize;
import com.ac.uk.student.teamwork.service.IceCreamSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IceCreamSizeServiceImpl implements IceCreamSizeService {

    @Autowired
    private IceCreamSizeMapper iceCreamSizeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return iceCreamSizeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IceCreamSize record) {
        return iceCreamSizeMapper.insert(record);
    }

    @Override
    public List<IceCreamSize> selectAll(int pagenumber, int pagesize) {
        return iceCreamSizeMapper.selectAll(pagenumber,pagesize);
    }

    @Override
    public int insertSelective(IceCreamSize record) {
        return iceCreamSizeMapper.insertSelective(record);
    }

    @Override
    public IceCreamSize selectByPrimaryKey(Integer id) {
        return iceCreamSizeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IceCreamSize record) {
        return iceCreamSizeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IceCreamSize record) {
        return iceCreamSizeMapper.updateByPrimaryKey(record);
    }
}
