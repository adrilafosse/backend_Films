package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Utilisateur;
import com.example.demo.service.UtilisateurService;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	private UtilisateurService utilisateurService;
	
	public UtilisateurController(UtilisateurService utilisateurService) {
		this.utilisateurService = utilisateurService;
	}
	//inscription
	@PostMapping("/inscription")
	public ResponseEntity<String> inscription(@RequestBody Utilisateur utilisateur) {
		boolean reponse = utilisateurService.inscription(utilisateur);
		if(reponse) {	
			return ResponseEntity.status(HttpStatus.CREATED).body("inscription réussie");
		}else {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("utilisateur existe déjà");
		}
	}
    //se connecter
	@PostMapping("/connexion")
	public boolean connexion(@RequestBody Utilisateur utilisateur){
		return utilisateurService.connexion(utilisateur);
	}
	//afficher les utilisateurs
	@GetMapping("/utilisateurs")
	public List<Utilisateur> listUtilisateurs() {
		return utilisateurService.listUtilisateurs();
	}
}
