package com.dhb.platform.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dhb.platform.entity.MdModule;

@Repository
public interface MdModuleMapper {
    int insert(MdModule record);

    int insertSelective(MdModule record);
    
    List<MdModule> selectModuleByParams(String parentRowid);
}