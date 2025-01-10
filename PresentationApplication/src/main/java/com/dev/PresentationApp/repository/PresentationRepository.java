package com.dev.PresentationApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.PresentationApp.entity.Presentation;

public interface PresentationRepository extends JpaRepository<Presentation, Integer>{

	Optional<Presentation> findByPid(Integer id);
}
