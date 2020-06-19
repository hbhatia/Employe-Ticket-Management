package com.nagarro.ticketmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.ticketmanagement.entity.Department;
import com.nagarro.ticketmanagement.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository deptartmentRepo;

	@Override
	public List<Department> getAllDepartment() {
		return deptartmentRepo.findAll();
	}

}
