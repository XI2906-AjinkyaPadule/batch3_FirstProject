package com.example.demo.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.EmployeeDetails;

//import com.example.demo.repository.EmployeeDetailsRepository;
//import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeDetailsService;



@RestController
@RequestMapping("/api")
public class EmployeeDetailsController {
	
	@Autowired
	private EmployeeDetailsService employeedetailsService;
	
	//To add Employee data
	@PostMapping("/employeeDetails")
	public String addEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) {
		employeedetailsService.save(employeeDetails);
		 return "employeedetails Addedd Successfully";
		
	}

	//To get all employee data
	@GetMapping("/employeeDetails")
	public List<EmployeeDetails> getAllEmpoyeeDetails(){
		return employeedetailsService.getAllEmployeeDetails();
	}
	
	@GetMapping("/employeeDetails/{id}")
	public EmployeeDetails getEmployeeDetails(@PathVariable("id") int id) {		
			return employeedetailsService.getEmployeeDetails(id);		
	}
	

	
	@DeleteMapping("/employeeDetails/{id}")
	public String deleteEmployeeDetails(@PathVariable("id") int id) {
		return employeedetailsService.deleteEmployeeDetails(id);		
	}
	
	@PutMapping("/employeeDetails/{id}")
	public String updateTraining(@PathVariable("id") int id,@RequestBody EmployeeDetails employeeDetails) {
		return employeedetailsService.updateEmployeeDetails(id,employeeDetails);
	
	}


}
