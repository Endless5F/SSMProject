package com.demo.ssm.entity;

public class User {
    private int uid;
    private String name;
    private String address;
    private String number;

    public User() {

    }

    public User(int uid, String name, String address, String number) {
        this.uid = uid;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
