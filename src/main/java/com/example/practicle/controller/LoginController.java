package com.example.practicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.practicle.entity.TeacherBo;
import com.example.practicle.exception.ResourceNotFoundException;
import com.example.practicle.service.LoginServiceImpl;

import jakarta.validation.Valid;

@Controller
@RequestMapping("login")
public class LoginController {

	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@PostMapping("signUP")
	private ResponseEntity<String>registerUser(@Valid @ModelAttribute TeacherBo bo,BindingResult result) {
		String msg=null;
		if(!result.hasErrors()) {
			msg=loginServiceImpl.registerUser(bo);
		}else {
			System.out.println(result.toString());
//			throw new ResourceNotFoundException("Please Fill Proper Data.");
		}
		return ResponseEntity.ok("");
	}
}
