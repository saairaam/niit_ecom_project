package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/index")
	public String showIndexPage() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String showLoginPage(){
		return "Login";
	}
	
	@RequestMapping("/register")
	public String showRegisterPage(){
		return "Register";
	}
	
	@RequestMapping("/contactus")
	public String showContactUsPage(){
		return "ContactUs";
	}
	
	@RequestMapping("/aboutus")
	public String showAboutUsPage(){
		return "AboutUs";
	}

}
