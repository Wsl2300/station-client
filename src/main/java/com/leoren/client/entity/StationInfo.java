package com.leoren.client.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class StationInfo implements Serializable {
    private String stationSid;

    private String stationName;

    private String stationArea;

    private String stationAdress;

    private String staionScale;

    private Boolean ifEnable;

    private Date enableTime;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getStationSid() {
        return stationSid;
    }

    public void setStationSid(String stationSid) {
        this.stationSid = stationSid;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationArea() {
        return stationArea;
    }

    public void setStationArea(String stationArea) {
        this.stationArea = stationArea;
    }

    public String getStationAdress() {
        return stationAdress;
    }

    public void setStationAdress(String stationAdress) {
        this.stationAdress = stationAdress;
    }

    public String getStaionScale() {
        return staionScale;
    }

    public void setStaionScale(String staionScale) {
        this.staionScale = staionScale;
    }

    public Boolean getIfEnable() {
        return ifEnable;
    }

    public void setIfEnable(Boolean ifEnable) {
        this.ifEnable = ifEnable;
    }

    public Date getEnableTime() {
        return enableTime;
    }

    public void setEnableTime(Date enableTime) {
        this.enableTime = enableTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stationSid=").append(stationSid);
        sb.append(", stationName=").append(stationName);
        sb.append(", stationArea=").append(stationArea);
        sb.append(", stationAdress=").append(stationAdress);
        sb.append(", staionScale=").append(staionScale);
        sb.append(", ifEnable=").append(ifEnable);
        sb.append(", enableTime=").append(enableTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}