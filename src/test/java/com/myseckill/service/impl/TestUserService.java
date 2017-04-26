package com.myseckill.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cloudPost.entity.User;
import com.cloudPost.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestUserService {
	
	@Autowired
	private UserService userService;
	
	/*
	 * the following are methods of UserService which need to be tested
	 * login ¡Ì
	 * register ¡Ì
	 */
	
//	@Test
	public void testLogin() {
		User user = new User();
		user.setUserid("xsm");
		user.setPassword("xs580231");
		boolean flag = userService.login(user);
		System.out.println(flag);
	}
	
//	@Test
	public void testRegister() {
		User user = new User();
		user.setUserid("zxd");
		user.setPassword("123");
		boolean flag = userService.register(user);
		System.out.println(flag);
	}
		

}
