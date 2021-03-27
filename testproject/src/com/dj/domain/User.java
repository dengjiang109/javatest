package com.dj.domain;

public class User {
    String name;
    String brithday;
    String sex;
    String  remarks;
    String tel;
    String occupation;

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", brithday='" + brithday + '\'' +
                ", sex='" + sex + '\'' +
                ", remarks='" + remarks + '\'' +
                ", tel='" + tel + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
