package com.leoren.client.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leoren.client.Service.StationDataService;
import com.leoren.client.entity.StationData;
import com.leoren.client.mapper.StationDataMapper;
import org.springframework.stereotype.Service;

@Service
public class StationImpl extends ServiceImpl<StationDataMapper, StationData> implements StationDataService {
}
