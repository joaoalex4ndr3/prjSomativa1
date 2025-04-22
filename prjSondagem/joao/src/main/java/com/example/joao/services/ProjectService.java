package com.example.joao.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.joao.entitis.Project;
import com.example.joao.repositories.ProjectRepository;

@Service
public class ProjectService {
	private final ProjectRepository projectRepository;
	
	@Autowired
	public ProjectService(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}
	
	public Project findProjectByid(Long id) {
		Optional<Project> project = projectRepository.findById(id);
		return project.orElse(null);
	}
	
	public List<Project> findAllProject() {
		return projectRepository.findAll();
	}
	
	public Project saveProject(Project project) {
		return projectRepository.save(project);
		
	}

}
