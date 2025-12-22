package com.example.demo.repository;

import com.example.demo.model.Film;
import com.example.demo.model.Utilisateur;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {
	//recuperation tous les films d'un utilisateur
	List<Film> findByUtilisateurIdUtilisateur(Long idUtilisateur);
	//recuperation tous les films par plateforme
	List<Film> findByPlateforme(String plateforme);
	//recuperation tous les films triés par note la plus haute
	List<Film> findAllByOrderByNoteDesc();
}
