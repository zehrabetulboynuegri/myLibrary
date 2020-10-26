package com.zbb.myLibrary.Business;

import java.util.List;

import com.zbb.myLibrary.Entities.Book;

public interface IBookService {
	List<Book> getAll();
	void add(Book book);
	void update(Book book);
	void delete(Book book);
	
}
