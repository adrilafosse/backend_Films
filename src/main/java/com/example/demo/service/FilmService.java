package com.example.demo.service;

import com.example.demo.model.Film;
import com.example.demo.repository.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    // Constructeur : Spring injecte automatiquement le FilmRepository
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    // Récupère tous les films en base
    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    // Ajoute un film en base
    public Film save(Film film) {
        return filmRepository.save(film);
    }
}
