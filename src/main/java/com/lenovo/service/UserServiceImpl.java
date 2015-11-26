package com.lenovo.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lenovo.dao.UserDao;
import com.lenovo.entity.User;

/**
 * @description 
 * @author 史彦磊
 * @version 1.0
 *  2015年1月8日
 */
@Service
public class UserServiceImpl implements UserService {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private UserDao userDao;

	public int addUser(User u) {
		return this.userDao.addUser(u);
	}

}
