package com.lenovo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lenovo.entity.User;
import com.lenovo.service.UserService;

/**
 * @description 
 * @author 史彦磊
 * @version 1.0
 *  2015年1月8日
 */
@Controller
public class UserController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/adduser",method=RequestMethod.GET)
	public String addUser(){
		log.debug("用户开始添加");
		if(userService.addUser(new User("username","password","nickname"))==1)
			return "success";
			return "error";
	}

}
