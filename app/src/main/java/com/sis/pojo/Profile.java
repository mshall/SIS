package com.sis.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Mohamed S. El-Shall on 4/12/2017.
 */

public class Profile implements Serializable {


    /**
     * ID : 16
     * name : student1
     * password : student
     * user_email : student@yahoo.com
     * gender : male
     * address : kkkkk
     * city : makas
     * phone : 677676767
     * picture : av1.png
     * type : 3
     * dept_id : 2
     */
    @SerializedName("ID")
    private String ID;
    @SerializedName("name")
    private String name;
    @SerializedName("password")
    private String password;
    @SerializedName("user_email")
    private String user_email;
    @SerializedName("gender")
    private String gender;
    @SerializedName("address")
    private String address;
    @SerializedName("city")
    private String city;
    @SerializedName("phone")
    private String phone;
    @SerializedName("picture")
    private String picture;
    @SerializedName("type")
    private String type;
    @SerializedName("dept_id")
    private String dept_id;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }
}
