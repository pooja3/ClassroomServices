package com.abharana.services.facade.dto.assembler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.abharana.services.domain.model.Students;


import com.abharana.services.facade.dto.entities.StudentsDTO;

import com.abharana.services.web.controllers.StudentsController;

public class StudentsAssembler {
	private static final Logger LOG = LoggerFactory
		    .getLogger(StudentsController.class);

	private StudentsAssembler(){
		
	}

	 public static void DTO2Object(StudentsDTO dto,
	            Students obj) {
	        obj.setId(dto.getId());
	        //obj.setUser(dto.getUserId());
	        obj.setAdmissionNo(dto.getAdmissionNo());
	        obj.setClassRollNo(dto.getClassRollNo());
	        obj.setFirstName(dto.getFirstName());
	        obj.setMiddleName(dto.getMiddleName());
	        obj.setLastName(dto.getLastName());
	        obj.setGender(dto.getGender());
	        obj.setDateOfBirth(dto.getDateOfBirth());
	    }
	
	 public static void Object2DTO(Students obj, StudentsDTO dto){
		dto.setId(obj.getId());
		dto.setAdmissionNo(obj.getAdmissionNo());
		dto.setClassRollNo(obj.getClassRollNo());
		dto.setFirstName(obj.getFirstName());
		dto.setMiddleName(obj.getMiddleName());
		dto.setLastName(obj.getLastName());
		dto.setGender(obj.getGender());
		dto.setDateOfBirth(obj.getDateOfBirth());
	 }
}