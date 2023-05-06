package com.leoren.client.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leoren.client.Service.RemoteOperationService;
import com.leoren.client.entity.RemoteOperation;
import com.leoren.client.mapper.RemoteOperationMapper;
import org.springframework.stereotype.Service;


public class RemoteOperationImpl extends ServiceImpl<RemoteOperationMapper, RemoteOperation>implements RemoteOperationService {
}
