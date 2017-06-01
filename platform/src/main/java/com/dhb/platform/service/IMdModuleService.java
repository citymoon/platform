package com.dhb.platform.service;

import java.util.List;
import java.util.Map;

import com.dhb.platform.entity.MdModule;

public interface IMdModuleService {
    
    public Map<String, List<MdModule>> getAllModule();

}
