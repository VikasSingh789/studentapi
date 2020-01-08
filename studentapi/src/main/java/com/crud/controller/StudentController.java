package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dto.StudentDTO;
import com.crud.model.Student;
import com.crud.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentserviceimpl;
	
	@RequestMapping(value="/api/students",method=RequestMethod.GET)
	public @ResponseBody List<StudentDTO> getAllStudents() {
		 return studentserviceimpl.getAllStudents();
	}
	
	@RequestMapping(value="/api/saveStudents",method=RequestMethod.POST)
	public @ResponseBody void save(@RequestBody StudentDTO studentDTO) {
		 studentserviceimpl.save(studentDTO);
	}
	
	@RequestMapping(value="/api/updateStudent",method=RequestMethod.PUT)
	public @ResponseBody void update(@RequestBody StudentDTO studentDTO) {
		studentserviceimpl.update(studentDTO);
	}
	
	@RequestMapping(value="/api/deleteStudent",method=RequestMethod.DELETE,params= {"sid"})
	public @ResponseBody void deleteStudent(@RequestParam Long sid ) {
		studentserviceimpl.delete(sid);
	}
}
