package com.ac.uk.student.teamwork.pojo;


/**
 * @description Customer entity class
 * @author Andrew Faber
 * @date 26/02/2021 16:02
 * @version 1.0
 * @reviewer Rentian
 * @date 9/3/2021
 */

public class Customer {

    private Integer id;
    private String address;
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    private String phone;


    public Customer(Integer id, String address, String email, String firstname, String lastname, String password, String phone) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.phone = phone;
    }

    public Integer getid() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getfirstName() {
        return firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String name) {
        this.firstname = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if(getClass() != obj.getClass()) {
            return false;
        }
        Customer other = (Customer) obj;
        return (this.getid() == null ? other.getid() == null : this.getid().equals(other.getid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getid() == null) ? 0 : getid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash= ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", firstname= ").append(firstname);
        sb.append(", lastname= ").append(lastname);
        sb.append(", password= ").append(password);
        sb.append(", address= ").append(address);
        sb.append(", email= ").append(email);
        sb.append(", phone= ").append(phone);
        sb.append("]");
        return sb.toString();
    }
}