package dao.impl;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import model.User;

public class UserDaoImplTest {

	@Test
	public void testFindIdByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByidAndPwd() {
		User user = new User();
		  UserDaoImpl userDaoImpl = new UserDaoImpl();
		  user = userDaoImpl.findByidAndPwd("17020031108", "zlz1999005511..");
		  System.out.println(user);
	}

	@Test
	public void testInsert() throws SQLException {
		User user = new User();
		  UserDaoImpl userDaoImpl = new UserDaoImpl();
		user.setSid("17020031106");
		user.setUserName("’‘¡¢÷«");
		user.setPassword("zlz1999005511..");
		user.setSex("nan");
		user.setPhoneNum("123");
		user.setSellNum(4);
		userDaoImpl.insert(user);
	}

}
