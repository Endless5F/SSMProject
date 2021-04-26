package com.demo.ssm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    @TableField("uid")
    private int uid;
    @TableField("name")
    private String name;
    @TableField("address")
    private String address;
    @TableField("number")
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
