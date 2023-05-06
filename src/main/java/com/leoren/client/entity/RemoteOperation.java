package com.leoren.client.entity;

import java.io.Serializable;
import java.util.Date;

public class RemoteOperation implements Serializable {
    private Integer operationId;

    private String stationSid;

    private Boolean remoteControlEnable;

    private Integer remoteControlInstruction;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public String getStationSid() {
        return stationSid;
    }

    public void setStationSid(String stationSid) {
        this.stationSid = stationSid;
    }

    public Boolean getRemoteControlEnable() {
        return remoteControlEnable;
    }

    public void setRemoteControlEnable(Boolean remoteControlEnable) {
        this.remoteControlEnable = remoteControlEnable;
    }

    public Integer getRemoteControlInstruction() {
        return remoteControlInstruction;
    }

    public void setRemoteControlInstruction(Integer remoteControlInstruction) {
        this.remoteControlInstruction = remoteControlInstruction;
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
        sb.append(", operationId=").append(operationId);
        sb.append(", stationSid=").append(stationSid);
        sb.append(", remoteControlEnable=").append(remoteControlEnable);
        sb.append(", remoteControlInstruction=").append(remoteControlInstruction);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}