package com.atguigu.atcrowdfunding.controller;

import com.atguigu.atcrowdfunding.manager.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.atcrowdfunding.manager.service.UserService;

@Controller
public class DispatcherController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String index() {
		System.out.println(userService);
		// userService.queryUser();
		System.out.println("hello there ~");
		return "index"; //返回的视图名viewName
	}
}
