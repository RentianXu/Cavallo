package com.ac.uk.student.teamwork.pojo;

import java.util.Calendar;
import java.util.Date;


/**
 * @description: Pojo Order class for database access
 * @author: Rex
 * @date: 2021-3-11
 * @reviewer: Rentian
 * @date: 2021-3-11
 * @version: 1.0
 */
public class Orders {

    private Integer id;
    private Integer customer_id;
    private Integer driver_id;
    private String address;
    private String postcode;
    private Date order_time ;
    private Integer order_type;
    private String remark;

    public Orders(Integer id, Integer customer_id, Integer driver_id, String address, String postcode, Date order_time, Integer order_type, String remark) {
        this.id = id;
        this.customer_id = customer_id;
        this.driver_id = driver_id;
        this.address = address;
        this.postcode = postcode;
        this.order_time = order_time;
        this.order_type = order_type;
        this.remark = remark;
    }

    public Orders() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(Integer driver_id) {
        this.driver_id = driver_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + id +
                ", customerId=" + customer_id +
                ", driverId=" + driver_id +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", orderTime=" + order_time +
                ", orderType=" + order_type +
                ", remark='" + remark + '\'' +
                '}';
    }

}
