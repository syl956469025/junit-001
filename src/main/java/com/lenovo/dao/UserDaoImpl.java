package com.lenovo.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lenovo.entity.User;

/**
 * @description 
 * @author 史彦磊
 * @version 1.0
 *  2015年1月8日
 */
@Repository
public class UserDaoImpl implements UserDao {
	
	Logger log = Logger.getLogger(this.getClass());
	
	protected JdbcTemplate jdbcTemplate= new JdbcTemplate();


	@Resource(name="dataSource")
//	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate.setDataSource(dataSource);
	}
	public int addUser(User u) {
		
		String sql = "insert into t_user  values('"
													+ u.getUsername()+"','"
													+ u.getPassword()+"','"
													+ u.getNickname()+"')";
		log.debug("执行的sql语句为：\n\n\n "+sql +"\n\n\n");
		log.debug("ceshi"+u.getUsername()+","+u.getPassword()+","+u.getNickname());
			try {
				this.jdbcTemplate.execute(sql);
				return 1;
			} catch (DataAccessException e) {
				e.printStackTrace();
				return 0;
			}
			
	}

}
