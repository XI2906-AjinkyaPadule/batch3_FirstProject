package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.OrgLocation;
import com.example.demo.repository.OrgLocationRepository;


@Service
public class OrgLocationService {
	
	@Autowired
	private OrgLocationRepository orgLocationRepository;
	List<OrgLocation> orgLocationList= new ArrayList<>();
	
	public OrgLocation save(OrgLocation orgLocation) {	
		return orgLocationRepository.save(orgLocation);		
	}

	public List<OrgLocation> getAllOrgLocation() {		
		return orgLocationRepository.findAll();  //To get all employee details
	}
	
	public OrgLocation getOrgLocation(int id) {
		Optional<OrgLocation> optOrgLocation =orgLocationRepository.findById(id);
//		return optEmp.isPresent()? optEmp.get():null;
		if (optOrgLocation.isPresent()) {
			return orgLocationRepository.getById(id);			 
		}else {
			return null;			
		}		
	}
	
	public String deleteOrgLocation(int id) {
		Optional<OrgLocation> optOrgLocation =orgLocationRepository.findById(id);
		if (optOrgLocation.isPresent()) {
			orgLocationRepository.deleteById(id);
			return "OrgLocation deleted successfully with id:"+id;
		}else {
			return "OrgLocation is not present with id:"+id;			
		}						
	}

}
