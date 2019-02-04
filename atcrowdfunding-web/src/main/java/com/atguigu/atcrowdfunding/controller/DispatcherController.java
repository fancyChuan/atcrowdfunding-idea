package com.atguigu.atcrowdfunding.controller;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.manager.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.atcrowdfunding.manager.service.UserService;

import javax.servlet.http.HttpSession;

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

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 在这里数据模型的好处就显示出来了，没有使用User封装的时候，需要把所有字段都作为参数传进来
     * 可拓展性差，而这里现在就只需要传入一个user对象即可
     *
     *
     *
     */
    @RequestMapping("/dologin")
    // public String dologin(String loginacct, String userpswd) {
    public String dologin(User user, HttpSession httpSession) {
        User dbUser = userService.queryLoginUser(user);
        if (dbUser == null) {
            String errorMsg = "登录失败，账号或者密码不对";
            httpSession.setAttribute("errorMsg", errorMsg);
            return "redirect:/login.htm";
        }
        return "main";
    }
}
