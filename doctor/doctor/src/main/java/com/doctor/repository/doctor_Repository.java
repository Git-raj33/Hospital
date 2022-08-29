package com.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.doctor.entity.doctor;

public interface doctor_Repository extends JpaRepository<doctor, Long>, JpaSpecificationExecutor<doctor> {

	
	public doctor findById(Integer id);
	public doctor findByIdAndName(Integer id, String name);
}
