package com.leoren.client.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leoren.client.Service.ComponentsService;
import com.leoren.client.entity.Components;
import com.leoren.client.mapper.ComponentsMapper;
import org.springframework.stereotype.Service;


public class ComponentsImpl extends ServiceImpl<ComponentsMapper, Components> implements ComponentsService {
}
