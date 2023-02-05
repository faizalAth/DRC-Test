package com.example.practicle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practicle.entity.StudentBo;
import com.example.practicle.entity.TeacherBo;
import com.example.practicle.repository.StudentRepo;
import com.example.practicle.repository.TeacherRepo;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired TeacherRepo teacherRepo;
	@Autowired StudentRepo studentRepo;
	
	@Override
	public String registerUser(TeacherBo bo) {
		System.out.println(teacherRepo.findByEmailId(bo.getEmail_id()));
		if(teacherRepo.findByEmailId(bo.getEmail_id())<=0) {
			if(teacherRepo.save(bo).getUser_id() > 0) {
				return bo.getName()+" Registered Successfully.";
			}else {
				return bo.getName()+" Not Registered.";
			}
		}else {
			return bo.getName()+" Already Registered.";
		}
	}
	
	@Override
	public String signInUser(TeacherBo bo) {
		System.out.println(teacherRepo.findByEmailId(bo.getEmail_id()));
		if(teacherRepo.verifyUserLogin(bo.getEmail_id(),bo.getPassword())<=0) {
				return "Invalid Credential/'s";
		}else {
			return "Login Success.";
		}
	}
	
	@Override
	public String addStudent(StudentBo bo) {
		if(studentRepo.findByRoleNo(bo.getRole_no())<=0) {
			if(studentRepo.save(bo).getStudent_id() > 0) {
				return bo.getName()+" Registered Successfully.";
			}else {
				return bo.getName()+" Not Registered.";
			}
		}else {
			return bo.getName()+" Already Registered.";
		}
	}
	
	@Override
	public StudentBo getStudent(int role_no) {
		return studentRepo.findByRole_no(role_no);
	}
}
