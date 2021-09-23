package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}






//Done for testing purpose
public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}





//***********************Commented for testing purpose****************************************

//	public Employee(int id, String name, int salary, OrgLocation orgLocation, Set<EmployeeDetails> employeeDetails,
//			Department department, Set<Training> training) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.orgLocation = orgLocation;
//		this.employeeDetails = employeeDetails;
//		this.department = department;
//		this.training = training;
//	}







	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
//***********************Commented for testing purpose****************************************


//	public OrgLocation getOrgLocation() {
//		return orgLocation;
//	}
//	public void setOrgLocation(OrgLocation orgLocation) {
//		this.orgLocation = orgLocation;
//	}

	

	



//	public Set<EmployeeDetails> getEmployeeDetails() {
//		return employeeDetails;
//	}
//
//
//
//	public void setEmployeeDetails(Set<EmployeeDetails> employeeDetails) {
//		this.employeeDetails = employeeDetails;
//	}

//
//
//	public Department getDepartment() {
//		return department;
//	}
//
//
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
//
//	
//
//
//
//	public Set<Training> getTraining() {
//		return training;
//	}
//
//
//
//	public void setTraining(Set<Training> training) {
//		this.training = training;
//	}





//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="org_loc_id")
//	private OrgLocation orgLocation;
//	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="emp_id")
//	private Set<EmployeeDetails> employeeDetails;
//	
//	@ManyToOne
//	@JoinColumn(name="dept_id")
//	private Department department;
//	
//	@ManyToMany
//	@JoinTable(name="employee_training",
//	joinColumns = @JoinColumn(name="emp_id"),
//	inverseJoinColumns=@JoinColumn(name="training_id"))
//	private Set<Training> training ;
//	

	





}
	
