package com.lenovo.service.classes;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lenovo.dao.classes.ClassesMapper;
import com.lenovo.entity.classes.Classes;

/**
 * @description 
 * @author 史彦磊
 * @version 1.0
 *  2015年3月17日
 */
@Service
public class ClassServiceImpl implements ClassService{
	
	@Autowired
	ClassesMapper classesMapper;

	public Integer addClasses() {
		Classes c = new Classes();
		c.setClasscount(20);
		c.setClasslevel(2);
		c.setClassname("软件一班");
		c.setId(UUID.randomUUID().toString());
		return this.classesMapper.insert(c);
	}

}
