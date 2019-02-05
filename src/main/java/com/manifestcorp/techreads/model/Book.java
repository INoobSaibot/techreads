package com.manifestcorp.techreads.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String title;
	String author;
	
	public Book() {}
	
	public Book(String title) {
		this.title = title;
	}
	
	public Long getId()  { return id; }
	
	public void setId(Long id) { this.id = id; }
	
	public String getTitle() { return this.title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}
