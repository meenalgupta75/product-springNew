package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.bean.Login;
import com.cts.product.service.LoginService;

@Controller
public class LoginController {

	
	
	@Autowired
	//@Qualifier("loginService")
	LoginService loginService;
	
	@RequestMapping(value="login.html")                //GetMapping(value="login.html", method= RequestMethod.GET) could also be done
	public String getLoginPage(){
		return "login";
	}
	
	@RequestMapping(value="login.html", method= RequestMethod.POST)						//PostMapping(value="login.html", method= RequestMethod.GET)
	public ModelAndView validateUser(@ModelAttribute Login login){
		ModelAndView modelAndView = new ModelAndView();
		if(loginService.authenticate("admin","admin")!=null){
			modelAndView.setViewName("admin");
		return modelAndView;
	}
	else{
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@RequestMapping(value="login.html", method= RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Login login){
		ModelAndView modelAndView = new ModelAndView();
		if("admin".equals(login.getUserName())&&"admin".equals(login.getPassword())){
			modelAndView.setViewName("admin");
			return modelAndView;
		}
		else{
			modelAndView.setViewName("login");
			return modelAndView;
		}
	}*/
	

