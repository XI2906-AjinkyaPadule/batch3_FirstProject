package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrgLocation {
	@Id
	@GeneratedValue
	private int id;
	private String towerNo;
	private String floorNo;
	private String seatNo;
	
	public OrgLocation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrgLocation(int id, String towerNo, String floorNo, String seatNo) {
		super();
		this.id = id;
		this.towerNo = towerNo;
		this.floorNo = floorNo;
		this.seatNo = seatNo;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTowerNo() {
		return towerNo;
	}

	public void setTowerNo(String towerNo) {
		this.towerNo = towerNo;
	}

	public String getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}




	




}
