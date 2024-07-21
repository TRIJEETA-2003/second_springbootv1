package com.trs.second_springbootv1.service;

import java.util.HashSet;

import com.trs.second_springbootv1.model.Book;

public interface BookService {
	HashSet<Book> findAllBooks();
	Book findId(long id);
	void addBook(Book b);
	void deleteAllBooks();
	Book findById(long bookid);

}
