package com.ac.uk.student.teamwork.pojo;

import java.util.Date;


/**
 * @description: Pojo Driver class for database access
 * @author: Peter
 * @date:
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
public class Driver {
    private Integer id;

    private String firstName;

    private String lastName;

    private Integer orderId;

    private Date deliveryTime;

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", orderId=" + orderId +
                ", deliveryTime=" + deliveryTime +
                '}';
    }

    public Driver(Integer id, String firstName, String lastName, Integer orderId, Date deliveryTime) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.orderId = orderId;
        this.deliveryTime = deliveryTime;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
