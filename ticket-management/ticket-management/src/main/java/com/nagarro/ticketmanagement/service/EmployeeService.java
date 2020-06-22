package com.nagarro.ticketmanagement.service;

import com.nagarro.ticketmanagement.dtos.EmployeeDto;
import com.nagarro.ticketmanagement.entity.Employee;

public interface EmployeeService {

	Employee createEmployee(EmployeeDto employee);

}
