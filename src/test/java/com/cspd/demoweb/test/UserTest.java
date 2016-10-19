package com.cspd.demoweb.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.UserService;
import com.websystique.springmvc.service.UserServiceImpl;


public class UserTest {
	
	private static UserService userService;
	
	@BeforeClass
	public static void init() {
		userService = new UserServiceImpl();
	}	
	
	@Test
	public void testUsers() {
		List<User> result = userService.findAllUsers();
		assertEquals(3, result.size());
	}	
		
	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test");
	}	
	
}
