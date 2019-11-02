package com.springboot.demo2.DXCSPRBOOT_2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo2.DXCSPRBOOT_2.model.Hospital;
import com.springboot.demo2.DXCSPRBOOT_2.service.HospitalService;

@CrossOrigin
@RestController
public class HospitalController {
	
	@Autowired
	HospitalService hospitalService;

	 @PostMapping(value = "/hospital") 
	 public String saveHospital(@RequestBody Hospital hospital) {
	 
	 return hospitalService.saveHospital(hospital); 
	 }
	 
	
	@GetMapping(value = "/hospital")
	public ArrayList<Hospital> getAllHospitals(){
		
		return hospitalService.getHospitals();
	}
		
	@GetMapping(value = "/hospital/{hospitalId}")
	public Object getHosp(@PathVariable int hospitalId) {
		
		return hospitalService.getHospital(hospitalId);
	}
	
	@DeleteMapping(value = "/hospital/{hospitalId}")
	public String deleteHospital(@PathVariable int hospitalId) {
		
		return hospitalService.deleteHospital(hospitalId);
	}
	
	@PutMapping(value = "/hospital")
	public String updateHospital(@RequestBody Hospital hospital) {
		
		return hospitalService.updateHospital(hospital);
	}
	
	
	
	
	
	
	
}
