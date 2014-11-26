package com.mercury.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.mercury.beans.RTSUser;
import com.mercury.dao.RegistrationDao;

public class RegistrationDaoImpl implements RegistrationDao{
	private SimpleJdbcTemplate template;
	
	public void setDataSource(DataSource dataSource) {
		template = new SimpleJdbcTemplate(dataSource);
	}
	
	@Override
	public void save(RTSUser rtsuser) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		Object[] params = {rtsuser.getUserID(), rtsuser.getPassword(), rtsuser.getFname(), rtsuser.getLname(), rtsuser.getBirthday(), rtsuser.getEmail(), "VALID"};
<<<<<<< HEAD
		//Object[] params={"123", "123", "123", "123", "123", "123", "VALID"};
=======
		//Object[] params={"345", "123", "123", "123", "123", "123", "VALID"};
>>>>>>> origin/master
=======
		//Object[] params = {rtsuser.getUserID(), rtsuser.getPassword(), rtsuser.getFname(), rtsuser.getLname(), rtsuser.getBirthday(), rtsuser.getEmail(), rtsuser.getUserstatus()};
		Object[] params={"123", "123", "123", "123", "123", "123", "VALID"};
>>>>>>> parent of c52a5c6... 14:50 11/26/2014
		String sql = "insert into RTSUser values(?,?,?,?,?,?,?)";
		template.update(sql, params);
	}

}
