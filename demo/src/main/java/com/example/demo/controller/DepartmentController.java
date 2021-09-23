package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;


import com.example.demo.service.DepartmentService;


@RestController
@RequestMapping("/api")

public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	//To add Employee data
	@PostMapping("/department")
	public String addDepartment(@RequestBody Department department) {
		 departmentService.save(department);
		 return "Department Addedd Successfully";
		
	}

	//To get all employee data
	@GetMapping("/department")
	public List<Department> getAllDepartment(){
		return departmentService.getAllDepartment();
	}
	
	@GetMapping("/department/{id}")
	public Department getDepartment(@PathVariable("id") int id) {		
			return departmentService.getDepartment(id);		
	}
	
	//To delete employee data by id
	@DeleteMapping("/department/{id}")
	public String deleteDepartment(@PathVariable("id") int id) {
		return departmentService.deleteDepartment(id);		
	}
	
	@PutMapping("/department/{id}")
	public String updateEmployee(@PathVariable("id") int id,@RequestBody Department department) {
		return departmentService.updateDepartment(id,department);
	
	}

}
