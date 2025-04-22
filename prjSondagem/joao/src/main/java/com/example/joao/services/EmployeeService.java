package com.example.joao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.joao.entitis.Employee;
import com.example.joao.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	private final EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public Employee findEmployeeByid(Long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		return employee.orElse(null);
	}
	
	public List<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}

}
