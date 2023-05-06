package com.leoren.client.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leoren.client.Service.IoStatusService;
import com.leoren.client.entity.IoStatus;
import com.leoren.client.mapper.IoStatusMapper;
import org.springframework.stereotype.Service;

public class IoStatusImpl extends ServiceImpl<IoStatusMapper, IoStatus> implements IoStatusService {
}
