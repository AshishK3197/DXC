package com.springboot.demo2.DXCSPRBOOT_2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
	
	@Id
	int hospitalId;
	String hospitalName;
	String hospitalDept;
	String hospitalLocation;
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalDept() {
		return hospitalDept;
	}
	public void setHospitalDept(String hospitalDept) {
		this.hospitalDept = hospitalDept;
	}
	public String getHospitalLocation() {
		return hospitalLocation;
	}
	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}
	
	

}
