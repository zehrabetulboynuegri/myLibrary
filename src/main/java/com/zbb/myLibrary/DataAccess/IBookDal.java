package com.zbb.myLibrary.DataAccess;

import java.util.List;

import com.zbb.myLibrary.Entities.Book;

public interface IBookDal {
	List<Book> getAll();
	void add(Book book);
	void update(Book book);
	void delete(Book book);
	

}
