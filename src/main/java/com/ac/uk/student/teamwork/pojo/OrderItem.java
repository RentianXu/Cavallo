package com.ac.uk.student.teamwork.pojo;


/**
 * @description: Pojo OrderItem class for database access
 * @author: Rentian
 * @date:  2021-3-6
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */
public class OrderItem {
    private int Id;

    private int quantity;

    private int order_id;

    private int icecream_id;

    private double subtotal;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getIcecream_id() {
        return icecream_id;
    }

    public void setIcecream_id(int icecream_id) {
        this.icecream_id = icecream_id;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public OrderItem(int id, int quantity, int order_id, int icecream_id, double subtotal) {
        Id = id;
        this.quantity = quantity;
        this.order_id = order_id;
        this.icecream_id = icecream_id;
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "Id=" + Id +
                ", quantity=" + quantity +
                ", order_id=" + order_id +
                ", icecream_id=" + icecream_id +
                ", subtotal=" + subtotal +
                '}';
    }
}
