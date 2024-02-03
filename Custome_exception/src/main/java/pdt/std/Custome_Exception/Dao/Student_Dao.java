package pdt.std.Custome_Exception.Dao;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import pdt.std.Custome_Exception.Entity.Student;
import pdt.std.Custome_Exception.creat.AgeException;

@Component
public class Student_Dao {

	public void validator(Student student) throws AgeException{
		
		int age=student.getAge();
		
		if (age>=18) {
			System.out.println("succsefull");
			
		} else {
        System.out.println("agevalidator");
         throw new AgeException();
		}
		
	}
	
	
}
