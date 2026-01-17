package com.example.demo.model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "films")
public class Film {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_film")
    private Long id_film;
	@Column(name = "titre")
    private String titre;  
	@Column(name = "avis")
    private String avis;  
	@Column(name = "note")
    private int note;
	@Column(name = "datevisionnage")
    private LocalDate dateVisionnage;
	@ManyToOne
	@JoinColumn (name = "fk_plateforme")
    private Plateforme plateforme;
	@ManyToOne
    @JoinColumn(name = "utilisateur")
    private Utilisateur utilisateur;
    
	Film() {
    }
	
	public Long getId_film() {
		return id_film;
	}
	public void setId_film(Long id_film) {
		this.id_film = id_film;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAvis() {
		return avis;
	}
	public void setAvis(String avis) {
		this.avis = avis;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public LocalDate getDateVisionnage() {
		return dateVisionnage;
	}
	public void setDateVisionnage(LocalDate dateVisionnage) {
		this.dateVisionnage = dateVisionnage;
	}
	public Plateforme getPlateforme() {
		return plateforme;
	}
	public void setPlateforme(Plateforme plateforme) {
		this.plateforme = plateforme;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
}

