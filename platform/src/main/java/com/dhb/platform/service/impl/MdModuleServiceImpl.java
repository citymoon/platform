package com.dhb.platform.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.dhb.platform.dao.MdModuleMapper;
import com.dhb.platform.entity.MdModule;
import com.dhb.platform.service.IMdModuleService;

public class MdModuleServiceImpl implements IMdModuleService {
    
    @Resource
    MdModuleMapper dao;

    @Override
    public Map<String, List<MdModule>> getAllModule() {
        //上级结点为0的模块为一级模块
        List<MdModule> firstModules = dao.selectModuleByParams("0");
        Map<String, List<MdModule>> resultModuleMap = null;
        for (MdModule mdModule : firstModules) {
            List<MdModule> moduleList = dao.selectModuleByParams(mdModule.getParentRowid().toString());
            resultModuleMap.put(mdModule.getMdName(), moduleList);
        }
        return resultModuleMap;
    }

}
