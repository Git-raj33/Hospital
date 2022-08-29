package com.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.patient.entity.patient;

@Repository
public interface patient_Repository extends JpaRepository<patient, Long>, JpaSpecificationExecutor<patient>
{

	public patient findById(Integer id);
	public patient findByIdAndName(Integer id, String name);
	
}
