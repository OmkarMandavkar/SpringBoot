package com.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class StudentController {

	@GetMapping("/stud/save")
	public String getStudents() {
		return "Student fetched";
	}

	@PostMapping("/stud/save")
	public String saveStudents() {
		return "Student fetched";
	}
	
//	@GetMapping("/stud/save")
//	public String getStudents() {
//		return "Student fetched";
//	}
//	
//	@GetMapping("/stud/save")
//	public String getStudents() {
//		return "Student fetched";
//	}
//	
//	@GetMapping("/stud/save")
//	public String getStudents() {
//		return "Student fetched";
//	}
//	
	
	
}
