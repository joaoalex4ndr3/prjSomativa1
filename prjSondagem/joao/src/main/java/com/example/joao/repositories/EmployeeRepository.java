package com.example.joao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.joao.entitis.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
