package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Film {
	
	//creer un id unique
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;  
    private int rating;    

    // getters et setters
    public Long getId(){ 
    	return id; 
    }
    public String getTitle() { 
    	return title; 
    }
    public void setTitle(String title) { 
    	this.title = title; 
    }
    public int getRating() { 
    	return rating; 
    }
    public void setRating(int rating) { 
    	this.rating = rating; 
    }
}

