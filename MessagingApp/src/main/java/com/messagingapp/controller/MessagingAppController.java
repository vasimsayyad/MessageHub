package com.messagingapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.messagingapp.domain.User;
import com.messagingapp.services.UserService;
 
@Controller
public class MessagingAppController {
	String message = "Welcome to Spring MVC!";
	@Autowired
	UserService userService;
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping("/addUser")
	public ModelAndView showRegisterUser() {
		return new ModelAndView("addUser","user",new User());
	}
	@RequestMapping("/ProcessAddUser")
	public ModelAndView registerUser(@ Valid @ModelAttribute("user")  User user,BindingResult result) {
		if(result.hasErrors()){
			System.out.println("there are errors in the form..");
			return new ModelAndView("addUser");
		}else{
			userService.add(user);
			return new ModelAndView("list");
		}
		
	}
}