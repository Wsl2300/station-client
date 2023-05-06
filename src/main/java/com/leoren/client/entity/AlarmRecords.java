package com.leoren.client.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class AlarmRecords {
    @TableId(type = IdType.AUTO)
    private Integer alarmInfoId;

    private String stationSid;

    private Date alarmTime;

    private String alarmObject;

    private String alarmInfo;

    private Date createTime;

    private Date updateTime;

}