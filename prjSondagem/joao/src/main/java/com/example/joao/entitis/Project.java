package com.example.joao.entitis;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeProject;

    @ManyToMany(mappedBy = "projects", fetch = FetchType.LAZY)  // nome correto do campo da outra classe
    private List<Employee> employees;

    public Project() {
    }

    public Project(Long id, String nomeProject, List<Employee> employees) {
        this.id = id;
        this.nomeProject = nomeProject;
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProject() {
        return nomeProject;
    }

    public void setNomeProject(String nomeProject) {  // nome do método corrigido
        this.nomeProject = nomeProject;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

