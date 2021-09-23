package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.EmployeeDetails;

//import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.EmployeeDetailsRepository;


@Service
public class EmployeeDetailsService {
	
	@Autowired
	private EmployeeDetailsRepository employeeDetailsRepository;
	List<EmployeeDetails> empDetailsList= new ArrayList<>();
	
	public EmployeeDetails save(EmployeeDetails employeeDetails) {	
		return employeeDetailsRepository.save(employeeDetails);		
	}

	public List<EmployeeDetails> getAllEmployeeDetails() {		
		return employeeDetailsRepository.findAll();  //To get all employee details
	}
	
	public EmployeeDetails getEmployeeDetails(int id) {
		Optional<EmployeeDetails> optEmpDetails =employeeDetailsRepository.findById(id);

		if (optEmpDetails.isPresent()) {
			return employeeDetailsRepository.getById(id);			 
		}else {
			return null;			
		}		
	}

	public String deleteEmployeeDetails(int id) {
		Optional<EmployeeDetails> optEmpDetails =employeeDetailsRepository.findById(id);
		if (optEmpDetails.isPresent()) {
			employeeDetailsRepository.deleteById(id);
			return "EmployeeDetails deleted successfully with id:"+id;
		}else {
			return "EmployeeDetails is not present with id:"+id;			
		}						
	}
	
	public String updateEmployeeDetails(int id, EmployeeDetails employeeDetails) {
		// TODO Auto-generated method stub
		Optional<EmployeeDetails> optEmpDetails =employeeDetailsRepository.findById(id);
		if (optEmpDetails.isPresent()) {
			EmployeeDetails empdetails = optEmpDetails.get();
			employeeDetails.setType(employeeDetails.getType());	
			employeeDetails.setDescription(employeeDetails.getDescription());
			
			employeeDetailsRepository.save(empdetails);
			return "EmployeeDetails updated successfully with id:"+id;
		}else {
			return "EmployeeDetails is not present with id:"+id;
		}		
	}
		
	}


