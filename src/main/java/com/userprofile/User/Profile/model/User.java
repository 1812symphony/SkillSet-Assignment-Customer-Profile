package com.userprofile.User.Profile.model;


public class User {
	private String username;
	private String country;
	private int watch_count;
	private String favourite_genre;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getWatch_count() {
		return watch_count;
	}
	
	public void setWatch_count(int watch_count) {
		this.watch_count = watch_count;
	}
	
	public String getFavourite_genre() {
		return favourite_genre;
	}
	
	public void setFavourite_genre(String favourite_genre) {
		this.favourite_genre = favourite_genre;
	}
	
	
}
