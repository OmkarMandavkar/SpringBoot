package com.dev.PresentationApp.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.dev.PresentationApp.dto.UserRequest;
import com.dev.PresentationApp.entity.User;
import com.dev.PresentationApp.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public boolean userRegister(UserRequest request) {
		Optional<User> opt = userRepository.findByEmail(request.getEmail());
		
		if(opt.isPresent()) {
			return false;
		}
		else {
			User user = new User();
			BeanUtils.copyProperties(request, user);
			userRepository.save(user);
			return true;	
		}		
	}
	
}
