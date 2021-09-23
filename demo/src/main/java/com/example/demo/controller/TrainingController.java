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
import com.example.demo.entity.Training;
//import com.example.demo.service.DepartmentService;
import com.example.demo.service.TrainingService;


@RestController
@RequestMapping("/api")

public class TrainingController {
	
	@Autowired
	private TrainingService trainingService;
	
	//To add Employee data
	@PostMapping("/training")
	public String addTraining(@RequestBody Training training) {
		trainingService.save(training);
		 return "Training Addedd Successfully";
		
	}

	//To get all employee data
	@GetMapping("/training")
	public List<Training> getAllTraining(){
		return trainingService.getAllTraining();
	}
	
	@GetMapping("/training/{id}")
	public Training getTraining(@PathVariable("id") int id) {		
			return trainingService.getTraining(id);		
	}
	
	//To delete employee data by id
	@DeleteMapping("/training/{id}")
	public String deleteTraining(@PathVariable("id") int id) {
		return trainingService.deleteTraining(id);		
	}
	
	@PutMapping("/training/{id}")
	public String updateTraining(@PathVariable("id") int id,@RequestBody Training training) {
		return trainingService.updateTraining(id,training);
	
	}

}
