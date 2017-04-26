package com.myseckill.service.impl;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cloudPost.entity.Letter;
import com.cloudPost.entity.Notify;
import com.cloudPost.entity.User;
import com.cloudPost.service.LetterService;
import com.cloudPost.service.NotifyService;
import com.cloudPost.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestLetterService {
	
	@Autowired
	private LetterService letterService;
	
	
	@Test
	public void testSaveLetter() {
		Letter letter = new Letter();
		letter.setTitle("test2");
		letter.setUserid("zxd");
		letter.setContent("test save letter");
		letter.setIspublic(1);
		letter.setSended(1);
		letter.setSavetime(new Date());
		boolean flag = letterService.saveLetter(letter);
		System.out.println(flag);
	}
	
	
//	@Test
	public void testSaveNotifyByParam(){
	}
	
	
//	@Test
	public void testUpdateNotify() {
	}
	
	
//	@Test
	public void testGetNotifyList(){
	}
	
}
