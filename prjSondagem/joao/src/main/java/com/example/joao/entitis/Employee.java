package com.example.joao.entitis;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_employee")
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nomeEmployee;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "tb_employee_projects",
        joinColumns = @JoinColumn(name = "employee_id"),
        inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private List<Project> projects;  // nome no plural

    public Employee() {
    }

    public Employee(Long id, String nomeEmployee, List<Project> projects) {
        this.id = id;
        this.nomeEmployee = nomeEmployee;
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEmployee() {
        return nomeEmployee;
    }

    public void setNomeEmployee(String nomeEmployee) {
        this.nomeEmployee = nomeEmployee;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
