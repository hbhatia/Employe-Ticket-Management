package com.nagarro.ticketmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import com.nagarro.ticketmanagement.entity.Department;
import com.nagarro.ticketmanagement.service.DepartmentService;


@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	
	@GetMapping("/viewAllDepartment")
	public ResponseEntity<List<Department>> getAllDepartment() {
		try {
			List<Department> departmentLst = departmentService.getAllDepartment();
				return new ResponseEntity<List<Department>>(departmentLst,HttpStatus.OK);
		}
		catch(Exception exc) {
			return new ResponseEntity<List<Department>>(HttpStatus.EXPECTATION_FAILED);
		}
		
	}
}
