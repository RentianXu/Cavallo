package com.ac.uk.student.teamwork.service;

import com.ac.uk.student.teamwork.pojo.Staff;

import java.util.List;

/**
 * @description: The methods bridging the front-end and back-end service interface StaffService
 * @author: Leon
 * @date:2021-2-28
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
public interface StaffService {
    //Query all staff information
    List<Staff> findAll();
    //Query records by staff name
    Staff findByStaffName(String username);
    //Login staff
    Staff loginStaff(Staff staff);
    //Register staff
    void registerStaff(Staff staff);
    //Change staff password
    void updateStaffPassword(Staff staff);

}
