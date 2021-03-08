package com.ac.uk.student.teamwork.pojo;



/**
 * @description: Pojo Staff class for database access
 * @author: Leon
 * @date: 2021-02-28
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */

public class Staff {
        private Integer id;
        private String username;
        private String password;

        @Override
        public String toString() {
            return "Staff{" +
                    "staffId=" + id +
                    ", staffName='" + username + '\'' +
                    ", staffPassword='" + password + '\'' +
                    '}';
        }

        public Integer getStaffId() {
            return id;
        }

        public void setStaffId(Integer staffId) {
            this.id = staffId;
        }

        public String getStaffName() {
            return username;
        }

        public void setStaffName(String StaffName) {
            this.username = StaffName;
        }

        public String getStaffPassword() {
            return password;
        }

        public void setStaffPassword(String StaffPassword) {
            this.password = StaffPassword;
        }

    public Staff(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
