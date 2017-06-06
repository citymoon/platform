package com.dhb.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sysconf")
public class SysConfController {
    
    
    @RequestMapping("/index")
    public ModelAndView getSysConf(){
        
        return null;
    }

}
