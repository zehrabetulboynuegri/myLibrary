package com.zbb.myLibrary.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zbb.myLibrary.Business.IBookService;
import com.zbb.myLibrary.Entities.Book;

@RestController
@RequestMapping("/api")
public class BookController {
	private IBookService bookService;

	@Autowired
	public BookController(IBookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/books")
	public List<Book> get() {
		return bookService.getAll();
	}
	

}
