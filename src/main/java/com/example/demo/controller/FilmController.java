package com.example.demo.controller;

import com.example.demo.model.Film;
import com.example.demo.service.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000") 
@RestController
@RequestMapping("/api/films")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    // GET /api/films → liste tous les films
    @GetMapping
    public List<Film> getAllFilms() {
        return filmService.findAll();
    }

    // POST /api/films → ajoute un film
    @PostMapping
    public Film createFilm(@RequestBody Film film) {
        return filmService.save(film);
    }
}

