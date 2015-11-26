//package com.lenovo.controller;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.lenovo.entity.User;
//import com.lenovo.service.UserService;
//
//
///**
// * @description 
// * @author 史彦磊
// * @version 1.0
// *  2015年1月8日
// */
////@RunWith(SpringJUnit4ClassRunner.class)
////@ContextConfiguration
////(locations={"/spring-mvc.xml","/spring-db.xml","/spring-bean.xml"})
//public class TestUserController {
//	
//	@Autowired
//	private UserService userService;
//	
//	
//	@Test
//	public void TestaddUser(){
//		int result = userService.addUser(new User("gk","gkp","gkn"));
//		Assert.assertEquals("用户添加失败",1, result);
//	}
//	
//
//}
