package com.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.entity.doctor;
import com.doctor.service.doctor_Service;

@RestController
public class doctor_Controller {
	
	@Autowired
	doctor_Service service;
	
	@PostMapping("/doctorregister")
	public doctor patientregister(@RequestBody doctor register) throws Exception {
		Integer tempId = register.getId();
		if(tempId != null && !"".equals(tempId)) {
			doctor registerObj = service.fetchdoctorById(tempId);
		if(registerObj != null) {
			throw new Exception("user with "+tempId+"is already exist");
		}
		}
		doctor registerObj= null;
		registerObj= service.savedoctor(register);
		return registerObj;

}
	
	@PostMapping("/login")
	public doctor logindoctor(@RequestBody doctor register) throws Exception {
		Integer tempId = register.getId();
		String tempName = register.getName();
		doctor registerObj = null;
		if(tempId != null && tempName != null) {
		registerObj = service.fetchdoctorByIdAndName(tempId,tempName);
		}
		if(registerObj == null) {
			throw new Exception("wrong credentials");
		}
		return registerObj;
	}
}
