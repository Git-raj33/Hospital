package com.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.patient.entity.patient;
import com.patient.repository.patient_Repository;

@Service
public class patient_Service {

	@Autowired
	private patient_Repository repo;
	
	public patient savepatient(patient register) {
		return repo.save(register);
	}
		
		public patient fetchpatientById(Integer id) {
		return	repo.findById(id);
		}
		
		public patient fetchpatientByIdAndName(Integer id,String name) {
			return	repo.findByIdAndName(id, name);
			}
}
