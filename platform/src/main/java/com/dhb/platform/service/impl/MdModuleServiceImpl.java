package com.dhb.platform.service.impl;

import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dhb.platform.dao.MdModuleMapper;
import com.dhb.platform.entity.MdModule;
import com.dhb.platform.service.IMdModuleService;

@Service
public class MdModuleServiceImpl implements IMdModuleService {
    
    @Resource
    MdModuleMapper dao;

    @Override
    public LinkedHashMap<String, List<MdModule>> getAllModule() {
        //上级结点为0的模块为一级模块
        List<MdModule> firstModules = dao.selectModuleByParams("0");
        LinkedHashMap<String, List<MdModule>> resultModuleMap = new LinkedHashMap<String, List<MdModule>>();
        for (MdModule mdModule : firstModules) {
            List<MdModule> moduleList = dao.selectModuleByParams(mdModule.getRowId().toString());
            resultModuleMap.put(mdModule.getMdName(), moduleList);
        }
        return resultModuleMap;
    }

}
