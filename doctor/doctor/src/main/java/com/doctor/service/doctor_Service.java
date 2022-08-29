package com.doctor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.entity.doctor;
import com.doctor.repository.doctor_Repository;

@Service
public class doctor_Service {
	
	@Autowired
	private doctor_Repository repo;
	
	public doctor savedoctor(doctor register) {
		return repo.save(register);
	}
	
	public doctor fetchdoctorById(Integer id) {
		return	repo.findById(id);
		}
	public doctor fetchdoctorByIdAndName(Integer id,String name) {
		return	repo.findByIdAndName(id, name);
		}

}
