package com.zbb.myLibrary.Business;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zbb.myLibrary.DataAccess.IBookDal;
import com.zbb.myLibrary.Entities.Book;
@Service
public class BookManager implements IBookService {
	private IBookDal bookDal;

	@Autowired
	public BookManager(IBookDal bookDal) {
		this.bookDal = bookDal;
	}

	@Override
	@Transactional
	public List<Book> getAll() {
		return bookDal.getAll();
	}

	@Override
	public void add(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Book book) {
		// TODO Auto-generated method stub

	}

}
