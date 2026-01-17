package com.example.demo.service;

import com.example.demo.model.Film;
import com.example.demo.model.Utilisateur;
import com.example.demo.repository.FilmRepository;
import com.example.demo.repository.UtilisateurRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService{
	
	private final FilmRepository filmRepository;
	
    public FilmService(FilmRepository filmRepository) {
    	this.filmRepository= filmRepository;
    }
    
    // Insérer un film
    public Film creationFilm(Film film) {   	 
        return filmRepository.save(film);
    }
    
    //recuperation tous les films d'un utilisateur
    public List<Film> recuperationListFilmParUtilisateur(Long idUtilisateur){
    	List<Film> listFilm = filmRepository.findByUtilisateurIdUtilisateur(idUtilisateur);
    	return listFilm;
    }
    //recuperation tous les films par plateforme
    public List<Film> recuperationFilmParPlateforme(Long idPlateforme){
    	List<Film> listFilm = filmRepository.findByPlateformeIdPlateforme(idPlateforme);
    	return listFilm;
    }
    //recuperation tous les films triés par note la plus haute
    public List<Film> recuperationFilmParNoteDecroissant(){
    	List<Film> listFilm = filmRepository.findAllByOrderByNoteDesc();
    	return listFilm;
    }
}
