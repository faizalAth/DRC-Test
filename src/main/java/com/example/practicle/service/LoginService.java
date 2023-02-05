package com.example.practicle.service;

import com.example.practicle.entity.StudentBo;
import com.example.practicle.entity.TeacherBo;

public interface LoginService {

	public String registerUser(TeacherBo bo);

	public String signInUser(TeacherBo bo);

	public String addStudent(StudentBo bo);

	public StudentBo getStudent(int role_no);
}
