package com.leoren.client.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ParamMapper  extends BaseMapper<com.leoren.client.entity.Param> {


    int deleteByPrimaryKey(Integer configItemId);

    int insert(com.leoren.client.entity.Param record);

    int insertSelective(com.leoren.client.entity.Param record);


    Param selectByPrimaryKey(Integer configItemId);

    int updateByPrimaryKeySelective(com.leoren.client.entity.Param record);

    int updateByPrimaryKey(com.leoren.client.entity.Param record);
}