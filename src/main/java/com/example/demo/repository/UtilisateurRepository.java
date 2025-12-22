package com.example.demo.repository;

import com.example.demo.model.Utilisateur;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
	//insciption
	//voir si utilisateur avec le meme nom et prenom n'existe pas
	Optional<Utilisateur> findByNomAndPrenom(String nom, String prenom);
	//connexion
	Optional<Utilisateur> findByPrenomAndNomAndMotDePasse(String prenom, String nom, String motDePasse);
}
