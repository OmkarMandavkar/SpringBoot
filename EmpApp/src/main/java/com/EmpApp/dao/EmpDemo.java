package com.EmpApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.EmpApp.repo.EmpRepo;

@Repository
public class EmpDemo {

	@Autowired
	private EmpRepo empRepo;
}
