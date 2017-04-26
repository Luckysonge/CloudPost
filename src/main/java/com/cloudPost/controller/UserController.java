package com.cloudPost.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloudPost.entity.User;
import com.cloudPost.service.UserService;

/**
 * @author 朱旭栋
 * @vertion 3.3
 * 用户控制类，用于处理前端的用户登录和用户注册等请求
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(User user, Model model) {
		System.out.println("get the request whose url is /login");
		boolean flag = userService.login(user);
		User user2 = userService.queryByName(user.getUserid());
		if(flag == true){
			model.addAttribute("user", user2);
			System.out.println("login successfully");
			return "phoneindex";
		} else{
			System.out.println("fail to login");
			return "register";
		}
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(User user){
		System.out.println("get the request whose url is /register");
		boolean flag = userService.register(user);
		if(flag == true){
			System.out.println("register successfully");
			return "phoneindex";
		} else{
			System.out.println("fail to register");
			return "register";
		}
	}
	
	@RequestMapping("/page")
	public String page(){
		return "register";
	}
}
