package com.dhb.platform.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhb.platform.entity.MdModule;
import com.dhb.platform.service.IMdModuleService;

@Controller
@RequestMapping("/module")
public class MdModuleController {
    
    @Resource
    IMdModuleService mdModuleService;
    
    @ResponseBody
    @RequestMapping("/getAll")
    public Map<String, List<MdModule>> getAllModule(){
        Map<String, List<MdModule>> modules = mdModuleService.getAllModule();
        return modules;
    }

}
