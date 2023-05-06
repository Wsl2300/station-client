package com.leoren.client.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leoren.client.entity.StationInfo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StationInfoMapper  extends BaseMapper<StationInfo> {
}