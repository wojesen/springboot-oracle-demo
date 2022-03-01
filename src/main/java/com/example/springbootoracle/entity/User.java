package com.example.springbootoracle.entity;

public class User {

    @Override
    public String toString() {

        return "User{" +
                "XID='" + xId + '\'' +
                ", XName='" + xName + '\'' +
                ", XAge='" + xAge + '\'' +
                '}';
    }


    private int xId; //对应数据库中的 XID
    private String xName; //对应数据库中的 XNAME
    private int xAge; //对应数据库中的 XAGE

    public int getxId() {
        return xId;
    }

    public void setxId(int xId) {
        this.xId = xId;
    }

    public String getxName() {
        return xName;
    }

    public void setxName(String xName) {
        this.xName = xName;
    }

    public int getxAge() {
        return xAge;
    }

    public void setxAge(int xAge) {
        this.xAge = xAge;
    }
}
