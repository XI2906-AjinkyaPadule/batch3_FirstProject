package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	List<Employee> empList= new ArrayList<>();
	
	
	
	public Employee save(Employee employee) {	
		return employeeRepository.save(employee);		
	}

	public List<Employee> getAllEmployee() {		
		return employeeRepository.findAll();  //To get all employee details
	}
	
	public Employee getEmployee(int id) {
		Optional<Employee> optEmp =employeeRepository.findById(id);
		Employee e = optEmp.isPresent()? optEmp.get():null;
		e.setName(e.getName()+" Changed");  //done for testing
		return e;
//************************ commented for testing **********************************
//		if (optEmp.isPresent()) {
//			return employeeRepository.getById(id);			 
//		}else {
//			return null;			
//		}		
	}

	public String deleteEmployee(int id) {
		Optional<Employee> optEmp =employeeRepository.findById(id);
		if (optEmp.isPresent()) {
			employeeRepository.deleteById(id);
			return "Employee deleted successfully with id:"+id;
		}else {
			return "Employee is not present with id:"+id;			
		}						
	}

	public String updateEmployee(int id, Employee employee) {
		
		Optional<Employee> optEmp =employeeRepository.findById(id);
		if (optEmp.isPresent()) {
			Employee emp = optEmp.get();
			emp.setName(employee.getName());	
			emp.setSalary(employee.getSalary());
//			employeeRepository.save(emp);
			emp=employeeRepository.save(emp);//changed for testing
			return "Employee updated successfully with id:"+id;
		}else {
			return "Employee is not present with id:"+id;
		}		
	}
	
	public Long getSumOfSalary() {
		return employeeRepository.getSumOfSalary();
	}
	
	public List<Employee> getAllEmployeePaging(int pageNo, int pageSize , String order) {		
		Pageable pageable = PageRequest.of(pageNo, pageSize, order.equals("asc")?Sort.by("name").ascending(): Sort.by("name").descending()) ;
		Page<Employee> page = employeeRepository.findAll(pageable);
		return page.toList();
		
		
	}
	
}
