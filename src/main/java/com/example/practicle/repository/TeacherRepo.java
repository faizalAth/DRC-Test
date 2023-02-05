package com.example.practicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.practicle.entity.TeacherBo;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherBo,Integer>{

	@Query(value = "select count(*) from TeacherBo where email_id=?1")
	int findByEmailId(String email_id);
	
	@Query(value = "select count(*) from TeacherBo where email_id=?1 and password=?2")
	int verifyUserLogin(String email_id,String password);
}
