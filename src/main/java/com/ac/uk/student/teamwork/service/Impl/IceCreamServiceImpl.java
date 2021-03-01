package com.ac.uk.student.teamwork.service.Impl;

import com.ac.uk.student.teamwork.mapper.IceCreamMapper;
import com.ac.uk.student.teamwork.pojo.IceCream;
import com.ac.uk.student.teamwork.service.IceCreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.List;

@Service
public class IceCreamServiceImpl implements IceCreamService {

    @Autowired
    private IceCreamMapper iceCreamMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return iceCreamMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IceCream record) {
        return iceCreamMapper.insert(record);
    }

    @Override
    public int insertSelective(IceCream record) {
        return iceCreamMapper.insertSelective(record);
    }

    @Override
    public List<IceCream> selectAll(int pagenumber, int pagesize) {
        return iceCreamMapper.selectAll(pagenumber, pagesize);
    }

    @Override
    public IceCream selectByPrimaryKey(Integer id) {
        return iceCreamMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IceCream record) {
        return iceCreamMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IceCream record) {
        return iceCreamMapper.updateByPrimaryKey(record);
    }

    public byte[] content;
    private File image;
    @Override
    public String writeImg() {
        try {
            if (image != null) {
                FileInputStream fin = new FileInputStream(image);
                ByteBuffer nbf = ByteBuffer.allocate((int) image.length());
                byte[] array = new byte[1024];
                int offset = 0, length = 0;
                while ((length = fin.read(array)) > 0) {
                    if (length != 1024)
                        nbf.put(array, 0, length);
                    else
                        nbf.put(array);
                    offset += length;
                }
                fin.close();
                content = nbf.array();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }



}

