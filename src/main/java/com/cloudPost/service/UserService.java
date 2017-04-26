package com.cloudPost.service;

import com.cloudPost.entity.User;


/**
 * 用户业务类
 * @author 旭栋
 * @version 2.18
 */
public interface UserService {
	
	
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	boolean login(User user);
	
	
	/**
	 * 注册
	 * @param user
	 * @return
	 */
	boolean register(User user);
	
	
	/**
	 * 查询用户
	 * @param name
	 * @return
	 */
	User queryByName(String name);
}
