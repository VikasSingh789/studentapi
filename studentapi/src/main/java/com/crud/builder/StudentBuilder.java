package com.crud.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.crud.dto.StudentDTO;
import com.crud.model.Student;
@Component("studentbuilder")
public class StudentBuilder {
	
	public Student convertDTOtoEntity(StudentDTO studentdto) {
		
		Student student = null;
		if(studentdto!=null) {
			student = new Student();
			student.setSid(studentdto.getSid());
			student.setSname(studentdto.getSname());
			student.setEmail(studentdto.getEmail());
			student.setAddress(studentdto.getAddress());
		}
		return student;
		
	}
	
	public StudentDTO convertEntitytoDTO(Student student) {
		
		StudentDTO studentdto = null;
		if(student!=null) {
			studentdto = new StudentDTO();
			studentdto.setSid(student.getSid());
			studentdto.setSname(student.getSname());
			studentdto.setEmail(student.getEmail());
			studentdto.setAddress(student.getAddress());
		}
		return studentdto;
	}
	
	public List<StudentDTO> getDTOList(List<Student> entitylist){
		List<StudentDTO> dtolist = new ArrayList<StudentDTO>();
		for(Student entity: entitylist) {
			dtolist.add(convertEntitytoDTO(entity));
		}
		return dtolist;
		
	}
	
	public List<Student> getEntityList(List<StudentDTO> dtolist){
		List<Student> entitylist = new ArrayList<Student>();
		for(StudentDTO dto : dtolist) {
			entitylist.add(convertDTOtoEntity(dto));
		}
		return entitylist;
	}

}
