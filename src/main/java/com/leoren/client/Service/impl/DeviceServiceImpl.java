package com.leoren.client.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leoren.client.Service.DeviceService;
import com.leoren.client.entity.Device;
import com.leoren.client.mapper.DeviceMapper;
import org.springframework.stereotype.Service;

public class DeviceServiceImpl extends ServiceImpl<DeviceMapper, Device> implements DeviceService {
}
