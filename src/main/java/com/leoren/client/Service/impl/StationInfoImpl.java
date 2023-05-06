package com.leoren.client.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leoren.client.Service.StationService;
import com.leoren.client.entity.StationInfo;
import com.leoren.client.mapper.StationInfoMapper;
import org.springframework.stereotype.Service;


public class StationInfoImpl extends ServiceImpl<StationInfoMapper, StationInfo> implements StationService{
}
