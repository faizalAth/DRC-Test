package com.example.practicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.practicle.entity.StudentBo;

@Repository
public interface StudentRepo extends JpaRepository<StudentBo,Integer>{

	@Query(value = "select count(*) from StudentBo where role_no=?1")
	int findByRoleNo(int role_no);

	@Query(value = "from StudentBo where role_no=?1")
	StudentBo findByRole_no(int role_no);
	
}
