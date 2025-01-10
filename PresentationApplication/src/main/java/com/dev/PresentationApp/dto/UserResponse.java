package com.dev.PresentationApp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {

	private Integer id;
	private String name;
	private String email;
	private Long phone;
	private Double userTotalScore;
}
