package com.dhb.platform.dao;

import java.util.List;

import com.dhb.platform.entity.MdModule;

public interface MdModuleMapper {
    int insert(MdModule record);

    int insertSelective(MdModule record);
    
    List<MdModule> selectModuleByParams(String param);
}