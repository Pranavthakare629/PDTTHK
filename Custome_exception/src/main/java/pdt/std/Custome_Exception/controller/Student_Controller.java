
package pdt.std.Custome_Exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import pdt.std.Custome_Exception.Entity.Student;
import pdt.std.Custome_Exception.Service.Student_Service;
import pdt.std.Custome_Exception.creat.AgeException;

@RestController
public class Student_Controller {

	@Autowired
	private Student_Service service;
	
	@GetMapping("/validate")
	public void agevali(@RequestBody Student student) throws AgeException {
		service.agevalidate(student);
	}
	
	
	
	
}
