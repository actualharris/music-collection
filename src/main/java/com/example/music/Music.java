package com.example.music;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Details")
public class Music {
	private String name;
	private String artist;
	private String genre;
	private String id;
	
	private String name2;
	private String artist2;
	private String genre2;
	private String id2;
	
	private int yearOfRelease;
	
	private int yearOfRelease2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name) {
		this.name2 = name;
	}

	public String getArtist2() {
		return artist2;
	}

	public void setArtist2(String artist) {
		this.artist2 = artist;
	}

	public String getGenre2() {
		return genre2;
	}

	public void setGenre2(String genre) {
		this.genre2 = genre;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public int getYearOfRelease2() {
		return yearOfRelease2;
	}

	public void setYearOfRelease2(int yearOfRelease) {
		this.yearOfRelease2 = yearOfRelease;
	}

	public String getId() {
		return id;
	}

	
	
	
	
}
