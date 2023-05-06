package com.leoren.client.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leoren.client.entity.RemoteOperation;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RemoteOperationMapper  extends BaseMapper<RemoteOperation> {

    int deleteByPrimaryKey(Integer operationId);

    int insert(RemoteOperation record);

    int insertSelective(RemoteOperation record);


    RemoteOperation selectByPrimaryKey(Integer operationId);


    int updateByPrimaryKeySelective(RemoteOperation record);

    int updateByPrimaryKey(RemoteOperation record);
}