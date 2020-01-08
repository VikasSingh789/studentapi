package com.crud.service;

import java.util.List;

import com.crud.dto.StudentDTO;
import com.crud.model.Student;

public interface StudentService {
	
		//Save Record
		void save(StudentDTO studentdto);
		
		//update record
		void update(StudentDTO studentdto);
		
		//delete record
		void delete(Long sid);
		
		//get all Student
		List<StudentDTO> getAllStudents();

		
		
		


	
}
