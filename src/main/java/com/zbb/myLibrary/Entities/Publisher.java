package com.zbb.myLibrary.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PUBLISHERS")
public class Publisher {
	@Id
	@GeneratedValue
	@Column(name = "PUBLISHER_ID")
	private Integer id;
	@Column(name = "PUBLISHER_NAME")
	private String name;
	@Column(name = "PUBLISHER_ABOUT")
	private String about;

	@OneToMany(mappedBy = "publisher")
	private List<Book> books = new ArrayList<>();
	public Publisher() {}
	public Publisher(Integer id, String name, String about) {
		super();
		this.id = id;
		this.name = name;
		this.about = about;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
}
