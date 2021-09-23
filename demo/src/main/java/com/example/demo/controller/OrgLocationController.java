package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.OrgLocation;

//import com.example.demo.service.DepartmentService;
import com.example.demo.service.OrgLocationService;



@RestController
@RequestMapping("/api")
public class OrgLocationController {
	
	@Autowired
	private OrgLocationService orgLocationService;
	
	//To add Employee data
	@PostMapping("/orgLocation")
	public String addOrgLocation(@RequestBody OrgLocation orgLocation) {
		orgLocationService.save(orgLocation);
		 return "OrgLocation Addedd Successfully";
		
	}

	//To get all employee data
	@GetMapping("/orgLocation")
	public List<OrgLocation> getAllOrgLocation(){
		return orgLocationService.getAllOrgLocation();
	}
	
	@GetMapping("/orgLocation/{id}")
	public OrgLocation getOrgLocation(@PathVariable("id") int id) {		
			return orgLocationService.getOrgLocation(id);		
	}
	
	//To delete employee data by id
	@DeleteMapping("/orgLocation/{id}")
	public String deleteOrgLocation(@PathVariable("id") int id) {
		return orgLocationService.deleteOrgLocation(id);		
	}

}
