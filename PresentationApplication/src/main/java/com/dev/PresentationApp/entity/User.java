package com.dev.PresentationApp.entity;

import java.util.List;

import com.dev.PresentationApp.enums.Role;
import com.dev.PresentationApp.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String email;

	private Long phone;

	private String password;

	private Presentation presentation;

	@Enumerated(EnumType.STRING)
	private Status status;

	@Enumerated(EnumType.STRING)
	private Role role;

	private Double userTotalScore;

	@OneToMany(mappedBy = "user")
	private List<Presentation> presentations;

//	@OneToMany(mappedBy = "user")
//	private List<Rating> ratings;

}