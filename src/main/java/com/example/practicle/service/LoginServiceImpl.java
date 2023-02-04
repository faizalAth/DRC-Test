package com.example.practicle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practicle.entity.TeacherBo;
import com.example.practicle.repository.TeacherRepo;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired TeacherRepo teacherRepo;
	@Override
	public String registerUser(TeacherBo bo) {
		if(teacherRepo.save(bo).getUser_id() > 0) {
			return bo.getName()+" Registered Successfully.";
		}else {
			return bo.getName()+" Not Registered.";
		}
	}

	
}
