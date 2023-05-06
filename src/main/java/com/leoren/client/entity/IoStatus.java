package com.leoren.client.entity;

import java.io.Serializable;
import java.util.Date;

public class IoStatus implements Serializable {
    private Integer id;

    private String stationSid;

    private Boolean autoMode;

    private Boolean manualMode;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStationSid() {
        return stationSid;
    }

    public void setStationSid(String stationSid) {
        this.stationSid = stationSid;
    }

    public Boolean getAutoMode() {
        return autoMode;
    }

    public void setAutoMode(Boolean autoMode) {
        this.autoMode = autoMode;
    }

    public Boolean getManualMode() {
        return manualMode;
    }

    public void setManualMode(Boolean manualMode) {
        this.manualMode = manualMode;
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
        sb.append(", id=").append(id);
        sb.append(", stationSid=").append(stationSid);
        sb.append(", autoMode=").append(autoMode);
        sb.append(", manualMode=").append(manualMode);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}