package com.dev.PresentationApp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

	private String name;
	private String email;
	private Long phone;
	private String password;
	private Double userTotalScore;
}