package com.home.articles.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Article {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	int id;
	String heading;
	String image;
	String description;
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(String heading, String image, String description) {
		super();
		this.id = id;
		this.heading = heading;
		this.image = image;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", heading=" + heading + ", image=" + image + ", description=" + description + "]";
	}
	
	
	
	
}
