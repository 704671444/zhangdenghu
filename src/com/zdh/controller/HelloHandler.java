package com.zdh.controller;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zdh.bean.User;
@Controller
public class HelloHandler {
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("加载中.........");
		return "success";
	}
	@RequestMapping("/abc")
	public String sayAbc() {
		System.out.println("加载中.........");
		return "abc";
	}
	@RequestMapping("/registUser")
	public String registUser(HttpServletRequest req,User user) {
		System.out.println(user);
		req.setAttribute("msg", user.getUserName());
		return "success";
	}
	@RequestMapping("/servletApi")
	public String servletApi(HttpServletRequest req,User user) {
		req.setAttribute("msg", user.getUserName());
		return "success";
	}

}
