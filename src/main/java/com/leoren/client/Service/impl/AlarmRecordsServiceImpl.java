package com.leoren.client.Service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leoren.client.Service.AlarmRecordsService;
import com.leoren.client.entity.AlarmRecords;
import com.leoren.client.mapper.AlarmRecordsMapper;
import org.springframework.stereotype.Service;
@Service
public class AlarmRecordsServiceImpl extends ServiceImpl<AlarmRecordsMapper,AlarmRecords> implements AlarmRecordsService {
}
