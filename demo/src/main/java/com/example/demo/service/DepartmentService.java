package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
//import com.example.demo.entity.Employee;
import com.example.demo.repository.DepartmentRepository;
//import com.example.demo.repository.EmployeeRepository;

@Service
public class DepartmentService {

	
	@Autowired
	private DepartmentRepository departmentRepository;
	List<Department> depList= new ArrayList<>();
	
	public Department save(Department department) {	
		return departmentRepository.save(department);		
	}



	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}
	
	public Department getDepartment(int id) {
		Optional<Department> optDep =departmentRepository.findById(id);
//		return optEmp.isPresent()? optDep.get():null;
		if (optDep.isPresent()) {
			return departmentRepository.getById(id);			 
		}else {
			return null;			
		}		
	}

	public String deleteDepartment(int id) {
		Optional<Department> optEmp =departmentRepository.findById(id);
		if (optEmp.isPresent()) {
			departmentRepository.deleteById(id);
			return "department deleted successfully with id:"+id;
		}else {
			return "department is not present with id:"+id;			
		}						
	}



	public String updateDepartment(int id, Department department) {
		// TODO Auto-generated method stub
		Optional<Department> optDep =departmentRepository.findById(id);
		if (optDep.isPresent()) {
			Department dep = optDep.get();
			dep.setDepName(department.getDepName());	
			
			departmentRepository.save(dep);
			return "Employee updated successfully with id:"+id;
		}else {
			return "Employee is not present with id:"+id;
		}		
	}
}



	





