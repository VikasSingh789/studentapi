package com.crud.dao;

import java.io.Serializable;
import java.util.List;

import com.crud.dto.StudentDTO;
import com.crud.model.Student;

public interface StudentDAO {
	
	
	List<Student> getAllStudents();
	
	<T extends Serializable> Serializable save(T object);
	
	<T extends Serializable> void update(T object);
	
	<T extends Serializable> void delete(T object);
	
	<T extends Serializable> T findBySid(Class<T> clazz, long sid);
		
}
