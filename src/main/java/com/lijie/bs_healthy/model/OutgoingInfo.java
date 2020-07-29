package com.lijie.bs_healthy.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class OutgoingInfo {
    private Integer id;

    private Integer custId;

    private String outSeason;

    private Date outTime;

    private Date backTime;

    private String accompany;

    private String relation;

    private String accompanyPhone;

    private String tips;

    private Date realbackTime;

    private String ischeck;

    private String isback;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getOutSeason() {
        return outSeason;
    }

    public void setOutSeason(String outSeason) {
        this.outSeason = outSeason == null ? null : outSeason.trim();
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Date getBackTime() {
        return backTime;
    }

    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    public String getAccompany() {
        return accompany;
    }

    public void setAccompany(String accompany) {
        this.accompany = accompany == null ? null : accompany.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getAccompanyPhone() {
        return accompanyPhone;
    }

    public void setAccompanyPhone(String accompanyPhone) {
        this.accompanyPhone = accompanyPhone == null ? null : accompanyPhone.trim();
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips == null ? null : tips.trim();
    }

    public Date getRealbackTime() {
        return realbackTime;
    }

    public void setRealbackTime(Date realbackTime) {
        this.realbackTime = realbackTime;
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck == null ? null : ischeck.trim();
    }

    public String getIsback() {
        return isback;
    }

    public void setIsback(String isback) {
        this.isback = isback == null ? null : isback.trim();
    }
}