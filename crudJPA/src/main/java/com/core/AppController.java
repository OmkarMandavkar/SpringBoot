package com.core;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
	private StudentRepository repository;

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		Student save = repository.save(student);
		System.out.println(save);
		System.out.println("Record Added");
		return save;
	}

	@GetMapping("/all")
	public List<Student> getAll() {
		List<Student> students = repository.findAll();
		System.out.println("\nAll Records:");
		for (Student student : students) {
			System.out.println(student);
		}
		return students;
	}

	@DeleteMapping("/delete")
	public String deleteStudents(@RequestParam int id) {
		repository.deleteById(id);
		System.out.println("Record Deleted");
		return "Record deleted";
	}

	@GetMapping("/fetch")
	public Student fetchById(@RequestParam int id) {

//		Student student = repository.getById(id);
		Optional<Student> op = repository.findById(id);
		Student student = null;
		if (op.isPresent()) {
			student = op.get();
		}
		System.out.println("Record Fetched: " + student);
		return student;
	}
}
