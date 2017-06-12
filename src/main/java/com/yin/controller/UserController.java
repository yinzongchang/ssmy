package com.yin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yin.model.User;
import com.yin.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	public UserController() {
		System.out.println("XXX-test");
	}
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findAllUser")
	public String findAllUser(HttpServletRequest request){
		
		List<User> listUser = userService.findAllUser();
		request.setAttribute("listUser", listUser);
		return "/allUser";
		
	}

}
