package com.msexample.department.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msexample.department.entity.Department;
import com.msexample.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Dept Controller - save");
		return  departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Optional<Department> findByDepartmentId(@PathVariable("id") Long id) {
		
		log.info("Dept Controller - find");
		return departmentService.findByDepartmentId(id);
	}
	
}
