package com.cloudPost.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudPost.dao.UserMapper;
import com.cloudPost.entity.User;
import com.cloudPost.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public boolean login(User user) {
		String password = userMapper.selectByPrimaryKey(user.getUserid()).getPassword();
		if(password.equals(user.getPassword())){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean register(User user) {
		int flag = userMapper.insert(user);
		if(flag == 0){
			return false;
		}
		else{
			return true;
		}
	}

	public User queryByName(String userid) {
		return userMapper.selectByPrimaryKey(userid);
	}

}
