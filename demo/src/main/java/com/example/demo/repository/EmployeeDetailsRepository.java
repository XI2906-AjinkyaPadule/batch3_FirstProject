package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.example.demo.entity.Department;
import com.example.demo.entity.EmployeeDetails;
//import com.example.demo.entity.Training;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails,Integer> {

}
