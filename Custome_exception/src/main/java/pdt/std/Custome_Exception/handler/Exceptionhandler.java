package pdt.std.Custome_Exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import pdt.std.Custome_Exception.Entity.Student;
import pdt.std.Custome_Exception.creat.AgeException;

@ControllerAdvice
public class Exceptionhandler {

	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Student> handled(AgeException ae) {
	Student student=new Student();
	student.setStatus(500);
	student.setError("your age is not valid for these");
		
		return new ResponseEntity<Student>(student,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
