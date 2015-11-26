package com.lenovo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lenovo.service.classes.ClassService;

/**
 * @description 
 * @author 史彦磊
 * @version 1.0
 *  2015年3月24日
 */
@Controller
public class ClassController {
	
	
	
	@Autowired
	ClassService classService;
	
	@RequestMapping("/addclasses")
	@ResponseBody
	public String addClasses(){
		return this.classService.addClasses().toString();
	}

}
