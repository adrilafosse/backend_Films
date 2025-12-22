package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Utilisateur;
import com.example.demo.repository.UtilisateurRepository;

@Service
public class UtilisateurService {
	
	private UtilisateurRepository utilisateurRepository;
	
	public UtilisateurService(UtilisateurRepository utilisateurRepository) {
		this.utilisateurRepository = utilisateurRepository;
	}
	
	// inscription
    public boolean inscription(Utilisateur utilisateur) {
    	Optional<Utilisateur> utilisateurTrouve = utilisateurRepository.findByNomAndPrenom(utilisateur.getNom(), utilisateur.getPrenom());
    	if(utilisateurTrouve.isEmpty()) {
    		//aucun utilisateur a le meme nom et prenom, on enregistre l'utilisateur dans la BDD
    		utilisateurRepository.save(utilisateur);
    		return true;
    	}else {
    		return false;
    	}
        
    }
    //se connecter
    public boolean connexion(Utilisateur utilisateur) {
    	//cherche si le nom, le prenom et le mot de passe corresponde a un enregistrement
    	Optional<Utilisateur> utilisateurTrouve = utilisateurRepository.findByPrenomAndNomAndMotDePasse(utilisateur.getPrenom(), utilisateur.getNom(), utilisateur.getMotDePasse());
    	return !utilisateurTrouve.isEmpty();
    }
    //afficher tous les utilisateurs
    public List<Utilisateur> listUtilisateurs(){
    	return utilisateurRepository.findAll();
    }
}
