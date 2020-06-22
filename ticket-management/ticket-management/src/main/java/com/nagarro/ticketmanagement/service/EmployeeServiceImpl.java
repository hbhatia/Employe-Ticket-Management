package com.nagarro.ticketmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.ticketmanagement.dtos.EmployeeDto;
import com.nagarro.ticketmanagement.entity.Employee;
import com.nagarro.ticketmanagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Employee createEmployee(EmployeeDto employee) {
		Employee emp=new Employee();
		emp=mapToEntity(employee);
		return empRepo.save(emp);
	}

	private Employee mapToEntity(EmployeeDto employee) {
		Employee entity=new Employee();
		entity.setEmpActive(Boolean.TRUE);
		entity.setEmpFirstName(employee.getEmpFirstName());
		entity.setEmpLastName(employee.getEmpLastName());
		entity.setEmpEmail(employee.getEmpEmail());
		return entity;
	}

}
