package com.ac.uk.student.teamwork.mapper;

import com.ac.uk.student.teamwork.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @description: Mapper mapping class for database access
 * @author: Leon
 * @date: 2021-02-28
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
@Mapper
@Repository
public interface StaffMapper {
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
