package com.dhb.platform.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dhb.platform.entity.JbdpUser;
import com.dhb.platform.entity.User;
import com.dhb.platform.service.IUserInfoService;

import org.apache.commons.lang.StringUtils;

@Controller
@RequestMapping("/user")
public class UserInfoController {
    
    @Resource
    IUserInfoService userInfoService;
    
    @Resource
    HttpServletRequest request;

    String loginPageUrl = "login";
    String successPageUrl = "success";
    String addUrl = "user/adduser";
    String upUrl = "user/upduser";
    
    @RequestMapping("/toadd")
    public ModelAndView toAdd(){
        return new ModelAndView(addUrl);
    }

    @RequestMapping("/adduser")
    public ModelAndView addUser(){
        String name = request.getParameter("name");
        String passwd = request.getParameter("passwd");
        String account = request.getParameter("account");
        userInfoService.addUser(name, passwd, account);
        return getAllUsers();
    }
    
    @RequestMapping("/toupdate")
    public ModelAndView toUpUser(){
    	String userId = request.getParameter("id");
    	JbdpUser user = userInfoService.getUserById(userId);
    	return new ModelAndView(upUrl,"user",user);
    }
    
    @RequestMapping("/update")
    public ModelAndView upUser(){
    	String userid = request.getParameter("id");
    	JbdpUser user = userInfoService.getUserById(userid);
        user.setUserName(request.getParameter("name"));
        user.setPassword(request.getParameter("passwd"));
        user.setAccount(request.getParameter("account"));
    	boolean flag = userInfoService.updateByPrimaryKey(user);
//    	if(!flag){
//    		return new ModelAndView(upUrl,"user",user);
//    	}
    	return getAllUsers();
    }
    
    @RequestMapping("/tosearch")
    public ModelAndView toSearchUser(){
    	String uname = request.getParameter("uname");
    	String uaccount = request.getParameter("uaccount");
    	if(StringUtils.isBlank(uname))
    		uname = "";
    	if(StringUtils.isBlank(uaccount))
    		uaccount = "";
    	Map<String,Object> params = new HashMap<String,Object>();
    	params.put("uname", uname);
    	params.put("uaccount", uaccount);
    	
    	List<JbdpUser> users = (List<JbdpUser>) userInfoService.getUsersByParam(params);
        return new ModelAndView(successPageUrl,"users",users);
    }
    
    @RequestMapping("/getall")
    public ModelAndView getAllUsers(){
        List<JbdpUser> users = (List<JbdpUser>) userInfoService.getAllUsersByMybatis();
        return new ModelAndView(successPageUrl,"users",users);
    }
    
    @ResponseBody
    @RequestMapping("/getjson")
    public User getUserToJson(){
        User user = userInfoService.loginUser("dhb", "1111");
        return user;
    }
    
    @RequestMapping("/delete")
    public ModelAndView delUserById(HttpServletRequest request){
        String userId = request.getParameter("id");
        userInfoService.deleteUserById(userId);
        return getAllUsers();
    }

}