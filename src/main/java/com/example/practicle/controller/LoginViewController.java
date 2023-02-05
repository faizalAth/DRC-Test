package com.example.practicle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginViewController {

	@RequestMapping("sign-up")
	public String signUpPage() {
		return "SignUp";
	}
	
	@RequestMapping("sign-IN")
	public String signInPage() {
		return "login";
	}
	
	@RequestMapping("add-student")
	public String addStudent() {
		return "addStudent";
	}
	
	@RequestMapping("teached-Dashboard")
	public String teacherDashboard() {
		return "teacherDashboard";
	}
}
