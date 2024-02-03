package pdt.std.Custome_Exception.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pdt.std.Custome_Exception.Dao.Student_Dao;
import pdt.std.Custome_Exception.Entity.Student;
import pdt.std.Custome_Exception.creat.AgeException;

@Service
public class Student_Service {

	@Autowired
	private Student_Dao dao;
	
	public void agevalidate(Student student) throws AgeException {
		dao.validator(student);
	}
	
	
}
