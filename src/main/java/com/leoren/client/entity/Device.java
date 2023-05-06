package com.leoren.client.entity;

import java.io.Serializable;
import java.util.Date;

public class Device implements Serializable {
    private Integer deviceId;

    private String deviceType;

    private String deviceName;

    private Integer deviceLocation;

    private String deviceModel;

    private String deviceParam;

    private Boolean isNormal;

    private String stationSid;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Integer getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(Integer deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceParam() {
        return deviceParam;
    }

    public void setDeviceParam(String deviceParam) {
        this.deviceParam = deviceParam;
    }

    public Boolean getIsNormal() {
        return isNormal;
    }

    public void setIsNormal(Boolean isNormal) {
        this.isNormal = isNormal;
    }

    public String getStationSid() {
        return stationSid;
    }

    public void setStationSid(String stationSid) {
        this.stationSid = stationSid;
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
        sb.append(", deviceId=").append(deviceId);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", deviceLocation=").append(deviceLocation);
        sb.append(", deviceModel=").append(deviceModel);
        sb.append(", deviceParam=").append(deviceParam);
        sb.append(", isNormal=").append(isNormal);
        sb.append(", stationSid=").append(stationSid);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}