package com.lijie.bs_healthy.model;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class CheckinInfo {
    private Integer custId;

    private String custName;

    private String custAge;

    private String custSex;

    private String custIdcard;

    private Integer bedId;

    private Date checkinTime;

    private Date timeout;

    private String phone;

    private Date birthdate;

    private String custTall;

    private String custMarry;

    private Double custWeight;

    private String custBlood;

    private String photo;

    private String tips;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustAge() {
        return custAge;
    }

    public void setCustAge(String custAge) {
        this.custAge = custAge == null ? null : custAge.trim();
    }

    public String getCustSex() {
        return custSex;
    }

    public void setCustSex(String custSex) {
        this.custSex = custSex == null ? null : custSex.trim();
    }

    public String getCustIdcard() {
        return custIdcard;
    }

    public void setCustIdcard(String custIdcard) {
        this.custIdcard = custIdcard == null ? null : custIdcard.trim();
    }

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public Date getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }

    public Date getTimeout() {
        return timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getCustTall() {
        return custTall;
    }

    public void setCustTall(String custTall) {
        this.custTall = custTall == null ? null : custTall.trim();
    }

    public String getCustMarry() {
        return custMarry;
    }

    public void setCustMarry(String custMarry) {
        this.custMarry = custMarry == null ? null : custMarry.trim();
    }

    public Double getCustWeight() {
        return custWeight;
    }

    public void setCustWeight(Double custWeight) {
        this.custWeight = custWeight;
    }

    public String getCustBlood() {
        return custBlood;
    }

    public void setCustBlood(String custBlood) {
        this.custBlood = custBlood == null ? null : custBlood.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips == null ? null : tips.trim();
    }

    @Override
    public String toString() {
        return "CheckinInfo{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custAge='" + custAge + '\'' +
                ", custSex='" + custSex + '\'' +
                ", custIdcard='" + custIdcard + '\'' +
                ", bedId='" + bedId + '\'' +
                ", checkinTime=" + checkinTime +
                ", timeout=" + timeout +
                ", phone='" + phone + '\'' +
                ", birthdate=" + birthdate +
                ", custTall='" + custTall + '\'' +
                ", custMarry='" + custMarry + '\'' +
                ", custWeight=" + custWeight +
                ", custBlood='" + custBlood + '\'' +
                ", photo='" + photo + '\'' +
                ", tips='" + tips + '\'' +
                '}';
    }
}