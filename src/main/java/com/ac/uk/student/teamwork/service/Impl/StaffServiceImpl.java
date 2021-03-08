package com.ac.uk.student.teamwork.service.Impl;


import com.ac.uk.student.teamwork.mapper.StaffMapper;
import com.ac.uk.student.teamwork.pojo.Staff;
import com.ac.uk.student.teamwork.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: Bridging the front-end and back-end service class StaffServiceImpl
 * @author: Leon
 * @date:2021-2-28
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffMapper staffMapper;

    @Override
    public List<Staff> findAll() {
        return staffMapper.findAll();
    }

    @Override
    public Staff findByStaffName(String username) {
        return staffMapper.findByStaffName(username);
    }

    @Override
    public Staff loginStaff(Staff staff) {
        return staffMapper.loginStaff(staff);
    }

    @Override
    public void registerStaff(Staff staff) {
        staffMapper.registerStaff(staff);
    }

    @Override
    public void updateStaffPassword(Staff staff) {
        staffMapper.updateStaffPassword(staff);
    }
}
