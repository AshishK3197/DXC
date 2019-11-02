package com.springboot.demo2.DXCSPRBOOT_2.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo2.DXCSPRBOOT_2.dao.HospitalDao;
import com.springboot.demo2.DXCSPRBOOT_2.model.Hospital;

@Service
public class HospitalService {

	@Autowired
	HospitalDao hospitaldao;
	
	public String saveHospital(Hospital hospital) {
		
		try {
			hospitaldao.saveHospital(hospital);
			return "Success";
			
		}
		catch (Exception e) {
			return "Error" + e;
		}
		
	}
	
	
	public ArrayList<Hospital> getHospitals(){
		try {
			return hospitaldao.getHospitals();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public Object getHospital(int hospitalId) {
		try {
			return hospitaldao.getHospital(hospitalId);
		}
		catch(Exception e) {
			return e;
		}
	}
	
	
	public String deleteHospital(int hospitalId) {
		try{
			return hospitaldao.deleteHospital(hospitalId);
		}
		catch (Exception e) {
			return "Error" +e;
		}
	}
	
	
	public String updateHospital(Hospital hospital) {
		try {
			return hospitaldao.updateHospital(hospital);
		}
		catch (Exception e) {
			return "Error"+e;
		}
	}
	
	
	
}
