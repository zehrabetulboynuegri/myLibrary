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
@Table(name = "AUTHORS")
public class Author {
	@Id
	@GeneratedValue
	@Column(name = "AUTHOR_ID")
	private Integer id;
	@Column(name = "AUTHOR_NAME")
	private String name;
	@Column(name = "AUTHOR_DESCRIPTION")
	private String description;

	@OneToMany(mappedBy = "author")
	private List<Book> books = new ArrayList<>();
	public Author() {}
	public Author(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
