package com.ac.uk.student.teamwork.pojo;

/**
 * @description: Pojo IceCream class for database access
 * @author: Peter
 * @date:
 * @reviewer: Rentian
 * @date: 2021-3-7
 * @version: 1.0
 */

public class IceCream {
    private Integer id;

    private String type;

    private String image;

    private Double surcharge;

    private String size;

    private Integer popularity;

    @Override
    public String toString() {
        return "IceCream{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", image='" + image + '\'' +
                ", surcharge=" + surcharge +
                ", size='" + size + '\'' +
                ", popularity=" + popularity +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(Double surcharge) {
        this.surcharge = surcharge;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public IceCream(Integer id, String type, String image, Double surcharge, String size, Integer popularity) {
        this.id = id;
        this.type = type;
        this.image = image;
        this.surcharge = surcharge;
        this.size = size;
        this.popularity = popularity;
    }


}