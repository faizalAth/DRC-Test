package com.example.practicle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginViewController {

	@RequestMapping("sign-up")
	public String signUpPage() {
		return "SignUp";
	}
}
