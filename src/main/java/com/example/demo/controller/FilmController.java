package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Film;
import com.example.demo.model.Utilisateur;
import com.example.demo.service.FilmService;

@RestController
@RequestMapping("/Film")
public class FilmController {
	private final FilmService filmService;
    
    FilmController(FilmService filmService) {
        this.filmService = filmService;
    }
    
    // creation film
    @PostMapping
    public Film creationFilm(@RequestBody Film film) {
        return filmService.creationFilm(film);
    }
    //recuperation tous les films d'un utilisateur
    @GetMapping("/recuperationId/{idUtilisateur}")
    public List<Film> recuperationListFilmParUtilisateur(@PathVariable Long idUtilisateur){
    	return filmService.recuperationListFilmParUtilisateur(idUtilisateur);
    }
    //recuperation tous les films par plateforme
    @GetMapping("/recuperationPlateforme/{plateforme}")
    public List<Film> recuperationFilmParPlateforme(@PathVariable Long idPlateforme){
    	return filmService.recuperationFilmParPlateforme(idPlateforme);
    }
    //recuperation tous les films triés par note la plus haute
    @GetMapping("/note")
    public List<Film> recuperationFilmParNoteDecroissant(){
    	return filmService.recuperationFilmParNoteDecroissant();
    }
}
