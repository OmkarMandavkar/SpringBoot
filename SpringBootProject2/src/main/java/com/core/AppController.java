package com.core;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@PostMapping("/stud/fetch")
	public String fetchStudents() {
		return "Student Fetched";
	}

	@PostMapping("/stud/save")
	public String saveStudents() {
		return "Student Saved";
	}

	@DeleteMapping("/delete")
	public String deleteStudents() {
		return "Student Deleted";
	}

	@GetMapping("/requestParam")
	public String requestParam(@RequestParam(name = "sname") String name, @RequestParam int id) {
		return "Hello " + name + " " + id;
	}

	@PostMapping("/pathVarible/name/{personName}/email/{email}")
	public String pathVarible(@PathVariable(name = "personName") String pname, @PathVariable String email) {

		System.out.println(pname + "\n" + email);
		return "Name: " + pname + " \nEmail: " + email;
	}
	
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue int sid, @CookieValue String name) {
		System.out.println(sid);
		System.out.println(name);
		return "Cookie Received";
	}

	@GetMapping("/header")
	public String readHeader(@RequestHeader String token, @RequestHeader String name) {
		System.out.println(token);
		System.out.println(name);
		return " Token Received";
	}

	@PostMapping("/savedata")
	public Person saveData(@RequestBody Person person) {
		System.out.println(person);
		return person;
	}
}
