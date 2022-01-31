package com.msexample.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msexample.department.entity.Department;
import com.msexample.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Dept service - save");
		return departmentRepository.save(department);
		
	}

	public Optional<Department> findByDepartmentId(Long id) {
		log.info("Dept service - find");
		return departmentRepository.findById(id);
	}
}
