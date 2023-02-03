package com.example.practicle.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.practicle.entity.TeacherBo;

@Controller
@RequestMapping("login")
public class LoginController {

	@PostMapping("signUP")
	private ResponseEntity<String>signUp(@ModelAttribute TeacherBo bo) {
		System.out.println(bo.toString());
		return ResponseEntity.ok(bo.getName()+" Registered Successfully..!!");
	}
}
