package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.mathutils.MathCalculation;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	//To add Employee data
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee employee) {
		 employeeService.save(employee);
		 return "Employee Addedd Successfully";
		
	}

	//To get all employee data
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	//To get employee data by id
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		//testing1
		System.out.println(new MathCalculation().calculateMultiplication(2,3));
		return employeeService.getEmployee(id);		
	}
	
	//To delete employee data by id
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		//testing2
		System.out.println(new MathCalculation().calculation(5,2));
		return employeeService.deleteEmployee(id);		
	}
	
	//To update employee data by id
	@PutMapping("/employee/{id}")
	public String updateEmployee(@PathVariable("id") int id,@RequestBody Employee employee) {
		return employeeService.updateEmployee(id,employee);
	
	}	
	
	@GetMapping("/employee/sumOfSalary")
	public Long getSumOfSalary() {
		return employeeService.getSumOfSalary();
	}
	
	@GetMapping("/employee/employeepaging/{pageNo}/{pageSize}/{order}")
	public List<Employee> getAllEmployeePaging(@PathVariable("pageNo") int pageNo,@PathVariable("pageSize") int pageSize,@PathVariable("order") String order){
		return employeeService.getAllEmployeePaging(pageNo,pageSize,order);
		}
	
	
	

	
}
	
	

