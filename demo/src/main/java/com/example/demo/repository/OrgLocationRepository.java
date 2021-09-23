package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.example.demo.entity.Department;
import com.example.demo.entity.OrgLocation;

@Repository
public interface OrgLocationRepository extends JpaRepository<OrgLocation,Integer> {

}
