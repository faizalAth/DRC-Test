package com.example.practicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.practicle.entity.StudentBo;
import com.example.practicle.entity.TeacherBo;
import com.example.practicle.service.LoginServiceImpl;

import jakarta.validation.Valid;

@Controller
@RequestMapping("login")
public class LoginController {

	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@PostMapping("signUP")
	private ResponseEntity<String>registerUser(@Valid @ModelAttribute TeacherBo bo,BindingResult result) {
		String msg="";
		if(!result.hasErrors()) {
			msg=loginServiceImpl.registerUser(bo);
		}else {
			System.out.println(result.toString());
//			throw new ResourceNotFoundException("Please Fill Proper Data.");
		}
		return ResponseEntity.ok(msg);
	}
	
	@PostMapping("signIN")
	private ResponseEntity<String>signInUser(@Valid @ModelAttribute TeacherBo bo,BindingResult result) {
		String msg="";
		if(!result.hasErrors()) {
			msg=loginServiceImpl.signInUser(bo);
		}else {
			System.out.println(result.toString());
//			throw new ResourceNotFoundException("Please Fill Proper Data.");
		}
		return ResponseEntity.ok(msg);
	}
	
	@PostMapping("addStudent")
	private ResponseEntity<String>addStudent(@Valid @ModelAttribute StudentBo bo,BindingResult result) {
		String msg="";
		if(!result.hasErrors()) {
			msg=loginServiceImpl.addStudent(bo);
		}else {
			System.out.println(result.toString());
//			throw new ResourceNotFoundException("Please Fill Proper Data.");
		}
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("getStudent/{role_no}")
	private ResponseEntity<StudentBo>getStudent(@PathVariable("role_no") int role_no) {
		StudentBo student=loginServiceImpl.getStudent(role_no);
		return ResponseEntity.ok(student);
	}
}
