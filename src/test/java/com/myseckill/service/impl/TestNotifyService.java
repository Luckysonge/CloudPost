package com.myseckill.service.impl;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cloudPost.entity.Notify;
import com.cloudPost.entity.User;
import com.cloudPost.service.NotifyService;
import com.cloudPost.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestNotifyService {
	
	@Autowired
	private NotifyService notifyService;
	
	
//	@Test
	public void testSaveNotify() {
		Notify notify = new Notify();
		notify.setIscomment(0);
		notify.setLetterid(0);
		notify.setReaded(0);
		notify.setSource("zxd");
		notify.setTime(new Date());
		notify.setUserid("xsm");
		notifyService.saveNotify(notify);
	}
	
	
//	@Test
	public void testSaveNotifyByParam(){
		boolean flag = notifyService.saveNotify("zxd", 1, "it's too late", new Date());
		System.out.println(flag);
	}
	
	
//	@Test
	public void testUpdateNotify() {
		notifyService.updateNotify(1);
	}
	
	
//	@Test
	public void testGetNotifyList(){
		List<Notify> notifyList = notifyService.getNotifyList("xsm");
		for(Notify notify:notifyList){
			System.out.println(JSON.toJSON(notify));
		}
	}
	
}
