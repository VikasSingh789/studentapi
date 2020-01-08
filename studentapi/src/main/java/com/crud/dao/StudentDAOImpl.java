package com.crud.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.dto.StudentDTO;
import com.crud.model.Student;

@Repository("studentdao")
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Student> getAllStudents() {
		return sessionFactory.getCurrentSession().createCriteria(Student.class).list();
	}

	@Override
	public <T extends Serializable> Serializable save(T object) {
		return sessionFactory.getCurrentSession().save(object);
	}

	@Override
	public <T extends Serializable> void update(T object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(object);
	}

	@Override
	public <T extends Serializable> void delete(T object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);
	}

	@Override
	public <T extends Serializable> T findBySid(Class<T> clazz, long sid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	

}
