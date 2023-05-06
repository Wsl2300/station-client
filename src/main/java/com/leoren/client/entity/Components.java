package com.leoren.client.entity;

import java.io.Serializable;
import java.util.Date;

public class Components implements Serializable {
    private Integer componentId;

    private String componentName;

    private String stationSid;

    private Float componentDeep;

    private Float componentLowRef;

    private Float componentHighRef;

    private Float linkHighRef;

    private Float linkLowRef;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getComponentId() {
        return componentId;
    }

    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getStationSid() {
        return stationSid;
    }

    public void setStationSid(String stationSid) {
        this.stationSid = stationSid;
    }

    public Float getComponentDeep() {
        return componentDeep;
    }

    public void setComponentDeep(Float componentDeep) {
        this.componentDeep = componentDeep;
    }

    public Float getComponentLowRef() {
        return componentLowRef;
    }

    public void setComponentLowRef(Float componentLowRef) {
        this.componentLowRef = componentLowRef;
    }

    public Float getComponentHighRef() {
        return componentHighRef;
    }

    public void setComponentHighRef(Float componentHighRef) {
        this.componentHighRef = componentHighRef;
    }

    public Float getLinkHighRef() {
        return linkHighRef;
    }

    public void setLinkHighRef(Float linkHighRef) {
        this.linkHighRef = linkHighRef;
    }

    public Float getLinkLowRef() {
        return linkLowRef;
    }

    public void setLinkLowRef(Float linkLowRef) {
        this.linkLowRef = linkLowRef;
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
        sb.append(", componentId=").append(componentId);
        sb.append(", componentName=").append(componentName);
        sb.append(", stationSid=").append(stationSid);
        sb.append(", componentDeep=").append(componentDeep);
        sb.append(", componentLowRef=").append(componentLowRef);
        sb.append(", componentHighRef=").append(componentHighRef);
        sb.append(", linkHighRef=").append(linkHighRef);
        sb.append(", linkLowRef=").append(linkLowRef);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}