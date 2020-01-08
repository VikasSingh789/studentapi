package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.builder.StudentBuilder;
import com.crud.dao.StudentDAO;
import com.crud.dto.StudentDTO;
import com.crud.model.Student;

@Service("studentserviceimpl")
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO studentdao;
	
	@Autowired
	private StudentBuilder studentbuilder;

	@Override
	public void save(StudentDTO studentdto) {
		// TODO Auto-generated method stub
		studentdao.save(studentbuilder.convertDTOtoEntity(studentdto));
		
	}

	@Override
	public void update(StudentDTO studentdto) {
		// TODO Auto-generated method stub
		studentdao.update(studentbuilder.convertDTOtoEntity(studentdto));
	}

	@Override
	public void delete(Long sid) {
		// TODO Auto-generated method stub
		studentdao.delete(studentdao.findBySid(Student.class, sid));
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		return studentbuilder.getDTOList(studentdao.getAllStudents());
	}
	
	

}
