package com.zbb.myLibrary.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKS")
public class Book {
 public Book(){}
	@Id
	@Column(name = "BOOK_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "ISBN")
	private String isbn;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "SUBTITLE")
	private String subtitle;
	
	@Column(name = "SERIES_NAME")
	private String seriesName;
	
	@Column(name = "PAGES")
	private int pages;
	
	@Column(name = "DESCRIPTION")
	private String description;

	public Book(int id, String isbn, String title, String subtitle, String seriesName, int pages, String description) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.subtitle = subtitle;
		this.seriesName = seriesName;
		this.pages = pages;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	

}