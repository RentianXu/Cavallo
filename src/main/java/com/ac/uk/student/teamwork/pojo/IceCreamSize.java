package com.ac.uk.student.teamwork.pojo;

public class IceCreamSize {
    private Integer id;

    private String size;

    private String cost;

    @Override
    public String toString() {
        return "IceCreamSize{" +
                "id=" + id +
                ", size='" + size + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }

    public IceCreamSize(Integer id, String size, String cost) {
        this.id = id;
        this.size = size;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}