package com.leoren.client.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class StationData implements Serializable {
    private Integer dataId;

    private String stationSid;

    private Float level_1;

    private Float level_2;

    private Float level_3;

    private Float outFlowRateRealtime;

    private Integer flowSumPositive;

    private Float temperature;

    private Float humid;

    private Float volteA;

    private Float volteB;

    private Float volteC;

    private Float y1Volte;

    private Float y1CurrentA;

    private Float y1CurrentB;

    private Float y1CurrentC;

    private Float y2Volte;

    private Float y2CurrentA;

    private Float y2CurrentB;

    private Float y2CurrentC;

    private Float y3Volte;

    private Float y3CurrentA;

    private Float y3CurrentB;

    private Float y3CurrentC;

    private Float y4Volte;

    private Float y4CurrentA;

    private Float y4CurrentB;

    private Float y4CurrentC;

    private Float y7Volte;

    private Float y7CurrentA;

    private Float y7CurrentB;

    private Float y7CurrentC;

    private Float y8Volte;

    private Float y8CurrentA;

    private Float y8CurrentB;

    private Float y8CurrentC;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    }