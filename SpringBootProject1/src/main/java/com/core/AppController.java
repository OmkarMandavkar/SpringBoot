package com.core;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/get")
	public String get() {
		return "Get Mapping";
	}

	@PostMapping("/post")
	public String post() {
		return "Post Mapping";
	}

	@DeleteMapping("/delete")
	public String delete() {
		return "Delete Mapping";
	}

	@PutMapping("/put")
	public String put() {
		return "Put Mapping";
	}

	@PatchMapping("/patch")
	public String patch() {
		return "Patch Mapping";
	}

}
