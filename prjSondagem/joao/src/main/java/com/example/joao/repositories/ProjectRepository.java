package com.example.joao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.joao.entitis.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{
	
}
