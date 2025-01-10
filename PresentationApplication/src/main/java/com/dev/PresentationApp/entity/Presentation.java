package com.dev.PresentationApp.entity;

import java.util.List;

import com.dev.PresentationApp.enums.PresentationStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Presentation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
	
	private String course;

	private String topic;

	@Enumerated(EnumType.STRING)
	private PresentationStatus presentationStatus;

	private Double userTotalScore;
	
    @OneToMany(mappedBy = "presentation")
    private List<Rating> ratings;
}