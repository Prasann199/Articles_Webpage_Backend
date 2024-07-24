package com.home.articles.model;

public class ArticleData {

	int id;
	String heading;
	String image;
	String description;
	@Override
	public String toString() {
		return "ArticleData [id=" + id + ", heading=" + heading + ", image=" + image + ", description=" + description
				+ "]";
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
	public ArticleData(int id, String heading, String image, String description) {
		super();
		this.id = id;
		this.heading = heading;
		this.image = image;
		this.description = description;
	}
	public ArticleData() {
		super();
		// TODO Auto-generated constructor stub
	}
}
