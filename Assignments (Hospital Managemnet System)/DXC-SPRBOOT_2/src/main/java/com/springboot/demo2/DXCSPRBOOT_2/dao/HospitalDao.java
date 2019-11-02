package com.springboot.demo2.DXCSPRBOOT_2.dao;

import java.util.ArrayList;	

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.demo2.DXCSPRBOOT_2.model.Hospital;

@Component
@Transactional
public class HospitalDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	public void saveHospital(Hospital hospital) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(hospital);
	}
	
	public Hospital getHospital( int Hospital_id) {
		
		Session session = sessionFactory.getCurrentSession();
		Hospital hospital = session.get(Hospital.class, Hospital_id);
		return hospital;
	}
	
	public String updateHospital(Hospital hospital) {
		
		Session session = sessionFactory.getCurrentSession();
		session.update(hospital);
		return "Hospital Updated";
		
	}
	
	public String deleteHospital(int Hospital_id) {
		
		Session session = sessionFactory.getCurrentSession();
		Hospital hospital1 = getHospital(Hospital_id);
		session.delete(hospital1);
		return "Hospital Deleted";
	}
	
	public ArrayList<Hospital> getHospitals(){
		Session session = sessionFactory.getCurrentSession();
		ArrayList<Hospital> hospitals = (ArrayList<Hospital>)session.createQuery("from Hospital").list();
		return hospitals;
	}


}
