package com.example.practicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practicle.entity.TeacherBo;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherBo,Integer>{

}
