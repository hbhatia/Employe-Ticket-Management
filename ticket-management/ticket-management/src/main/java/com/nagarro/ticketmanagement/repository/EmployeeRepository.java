package com.nagarro.ticketmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.ticketmanagement.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Employee findByUserName(String userName);
	
	Boolean existsByUserName(String username);

	Boolean existsByEmpEmail(String email);
}
