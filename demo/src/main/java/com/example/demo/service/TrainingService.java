package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Training;
//import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.TrainingRepository;

@Service
public class TrainingService {

	@Autowired
	private TrainingRepository trainingRepository;
	List<Training> trainList= new ArrayList<>();
	
	public Training save(Training training) {	
		return trainingRepository.save(training);		
	}

	public List<Training> getAllTraining() {		
		return trainingRepository.findAll();  //To get all employee details
	}
	
	public Training getTraining(int id) {
		Optional<Training> optTrain =trainingRepository.findById(id);
//		return optEmp.isPresent()? optEmp.get():null;
		if (optTrain.isPresent()) {
			return trainingRepository.getById(id);			 
		}else {
			return null;			
		}		
	}

	public String deleteTraining(int id) {
		Optional<Training> optTrain =trainingRepository.findById(id);
		if (optTrain.isPresent()) {
			trainingRepository.deleteById(id);
			return "Training deleted successfully with id:"+id;
		}else {
			return "Training is not present with id:"+id;			
		}						
	}
	
	public String updateTraining(int id, Training training) {
		
		Optional<Training> optTrain =trainingRepository.findById(id);
		if (optTrain.isPresent()) {
			Training train = optTrain.get();
			train.setCourse(training.getCourse());	
			
			trainingRepository.save(train);
			return "Training updated successfully with id:"+id;
		}else {
			return "Training is not present with id:"+id;
		}		
	}
}
