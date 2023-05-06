package com.leoren.client.entity;

import java.io.Serializable;
import java.util.Date;

public class Param implements Serializable {
    private Integer configItemId;

    private Float fixHeight1;

    private Float fixHeight2;

    private Float fixHeight3;

    private Float lowRef1;

    private Float highRef1;

    private Float lowRef2;

    private Float highRef2;

    private Float lowRef3;

    private Float highRef3;

    private Float superHighRef1;

    private Float linkHighRef2;

    private Float linkLowRef2;

    private Float linkHighRef3;

    private Float linkLowRef3;

    private Integer y3456RuntimeMin;

    private Integer y3456OfftimeMin;

    private Integer y10RuntimeMin;

    private Integer y10OfftimeMin;

    private Integer y12RuntimeMin;

    private Integer y12OfftimeMin;

    private String stationSid;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getConfigItemId() {
        return configItemId;
    }

    public void setConfigItemId(Integer configItemId) {
        this.configItemId = configItemId;
    }

    public Float getFixHeight1() {
        return fixHeight1;
    }

    public void setFixHeight1(Float fixHeight1) {
        this.fixHeight1 = fixHeight1;
    }

    public Float getFixHeight2() {
        return fixHeight2;
    }

    public void setFixHeight2(Float fixHeight2) {
        this.fixHeight2 = fixHeight2;
    }

    public Float getFixHeight3() {
        return fixHeight3;
    }

    public void setFixHeight3(Float fixHeight3) {
        this.fixHeight3 = fixHeight3;
    }

    public Float getLowRef1() {
        return lowRef1;
    }

    public void setLowRef1(Float lowRef1) {
        this.lowRef1 = lowRef1;
    }

    public Float getHighRef1() {
        return highRef1;
    }

    public void setHighRef1(Float highRef1) {
        this.highRef1 = highRef1;
    }

    public Float getLowRef2() {
        return lowRef2;
    }

    public void setLowRef2(Float lowRef2) {
        this.lowRef2 = lowRef2;
    }

    public Float getHighRef2() {
        return highRef2;
    }

    public void setHighRef2(Float highRef2) {
        this.highRef2 = highRef2;
    }

    public Float getLowRef3() {
        return lowRef3;
    }

    public void setLowRef3(Float lowRef3) {
        this.lowRef3 = lowRef3;
    }

    public Float getHighRef3() {
        return highRef3;
    }

    public void setHighRef3(Float highRef3) {
        this.highRef3 = highRef3;
    }

    public Float getSuperHighRef1() {
        return superHighRef1;
    }

    public void setSuperHighRef1(Float superHighRef1) {
        this.superHighRef1 = superHighRef1;
    }

    public Float getLinkHighRef2() {
        return linkHighRef2;
    }

    public void setLinkHighRef2(Float linkHighRef2) {
        this.linkHighRef2 = linkHighRef2;
    }

    public Float getLinkLowRef2() {
        return linkLowRef2;
    }

    public void setLinkLowRef2(Float linkLowRef2) {
        this.linkLowRef2 = linkLowRef2;
    }

    public Float getLinkHighRef3() {
        return linkHighRef3;
    }

    public void setLinkHighRef3(Float linkHighRef3) {
        this.linkHighRef3 = linkHighRef3;
    }

    public Float getLinkLowRef3() {
        return linkLowRef3;
    }

    public void setLinkLowRef3(Float linkLowRef3) {
        this.linkLowRef3 = linkLowRef3;
    }

    public Integer getY3456RuntimeMin() {
        return y3456RuntimeMin;
    }

    public void setY3456RuntimeMin(Integer y3456RuntimeMin) {
        this.y3456RuntimeMin = y3456RuntimeMin;
    }

    public Integer getY3456OfftimeMin() {
        return y3456OfftimeMin;
    }

    public void setY3456OfftimeMin(Integer y3456OfftimeMin) {
        this.y3456OfftimeMin = y3456OfftimeMin;
    }

    public Integer getY10RuntimeMin() {
        return y10RuntimeMin;
    }

    public void setY10RuntimeMin(Integer y10RuntimeMin) {
        this.y10RuntimeMin = y10RuntimeMin;
    }

    public Integer getY10OfftimeMin() {
        return y10OfftimeMin;
    }

    public void setY10OfftimeMin(Integer y10OfftimeMin) {
        this.y10OfftimeMin = y10OfftimeMin;
    }

    public Integer getY12RuntimeMin() {
        return y12RuntimeMin;
    }

    public void setY12RuntimeMin(Integer y12RuntimeMin) {
        this.y12RuntimeMin = y12RuntimeMin;
    }

    public Integer getY12OfftimeMin() {
        return y12OfftimeMin;
    }

    public void setY12OfftimeMin(Integer y12OfftimeMin) {
        this.y12OfftimeMin = y12OfftimeMin;
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
        sb.append(", configItemId=").append(configItemId);
        sb.append(", fixHeight1=").append(fixHeight1);
        sb.append(", fixHeight2=").append(fixHeight2);
        sb.append(", fixHeight3=").append(fixHeight3);
        sb.append(", lowRef1=").append(lowRef1);
        sb.append(", highRef1=").append(highRef1);
        sb.append(", lowRef2=").append(lowRef2);
        sb.append(", highRef2=").append(highRef2);
        sb.append(", lowRef3=").append(lowRef3);
        sb.append(", highRef3=").append(highRef3);
        sb.append(", superHighRef1=").append(superHighRef1);
        sb.append(", linkHighRef2=").append(linkHighRef2);
        sb.append(", linkLowRef2=").append(linkLowRef2);
        sb.append(", linkHighRef3=").append(linkHighRef3);
        sb.append(", linkLowRef3=").append(linkLowRef3);
        sb.append(", y3456RuntimeMin=").append(y3456RuntimeMin);
        sb.append(", y3456OfftimeMin=").append(y3456OfftimeMin);
        sb.append(", y10RuntimeMin=").append(y10RuntimeMin);
        sb.append(", y10OfftimeMin=").append(y10OfftimeMin);
        sb.append(", y12RuntimeMin=").append(y12RuntimeMin);
        sb.append(", y12OfftimeMin=").append(y12OfftimeMin);
        sb.append(", stationSid=").append(stationSid);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}