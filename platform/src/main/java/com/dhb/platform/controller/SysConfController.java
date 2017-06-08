package com.dhb.platform.controller;

import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dhb.platform.entity.MdModule;
import com.dhb.platform.entity.OaConfigTab;
import com.dhb.platform.service.IMdModuleService;
import com.dhb.platform.service.IOaConfigService;

@Controller
@RequestMapping("/sysconf")
public class SysConfController {
    
    @Resource
    IOaConfigService oaConfigService;
    
    @Resource
    IMdModuleService mdModuleService;
    
    @RequestMapping("/index")
    public ModelAndView getSysConf(Model model){
        LinkedHashMap<String, List<MdModule>> modules = mdModuleService.getAllModule();
        OaConfigTab oaConfigTab = oaConfigService.getOaConfigTab();
        model.addAttribute("modules",modules);
        model.addAttribute("oaConfigTab",oaConfigTab);
        return new ModelAndView("sysconf/firstIndex", "model", model);
    }

}
