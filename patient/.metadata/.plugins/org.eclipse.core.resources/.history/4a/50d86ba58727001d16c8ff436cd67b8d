package com.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.patient.entity.patient;
import com.patient.service.patient_Service;

@RestController
public class patient_Controller {

	@Autowired
	private patient_Service service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/patientregister")
	public patient patientregister(@RequestBody patient register) throws Exception {
		Integer tempId = register.getId();
		if(tempId != null && !"".equals(tempId)) {
			patient registerObj = service.fetchpatientById(tempId);
		if(registerObj != null) {
			throw new Exception("user with "+tempId+"is already exist");
		}
		}
		patient registerObj= null;
		registerObj= service.savepatient(register);
		return registerObj;
	}
	
	@PostMapping("/login")
	public patient loginpatient(@RequestBody patient register) throws Exception {
		Integer tempId = register.getId();
		String tempName = register.getName();
		patient registerObj = null;
		if(tempId != null && tempName != null) {
		registerObj = service.fetchpatientByIdAndName(tempId,tempName);
		}
		if(registerObj == null) {
			throw new Exception("wrong credentials");
		}
		return registerObj;
	}
}
