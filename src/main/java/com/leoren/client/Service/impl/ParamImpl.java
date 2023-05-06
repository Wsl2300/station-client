package com.leoren.client.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leoren.client.Service.ParamService;
import com.leoren.client.entity.Param;
import com.leoren.client.mapper.ParamMapper;
import org.springframework.stereotype.Service;


public class ParamImpl extends ServiceImpl<ParamMapper, Param>implements ParamService {
}
