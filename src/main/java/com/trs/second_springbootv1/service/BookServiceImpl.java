package com.trs.second_springbootv1.service;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.trs.second_springbootv1.model.Book;

@Service
public class BookServiceImpl implements BookService {
	HashSet<Book> booklist = new HashSet<>();
	@Override
	public HashSet<Book> findAllBooks() {
		if(booklist.isEmpty()) {
			return null;
		}else {
			return booklist;
		}
	}

	@Override
	public Book findById(long bookid) {
		Book book = booklist.stream().filter(b -> b.getBookid() == bookid).findAny().orElse(null);
		return book;
	}

	@Override
	public void addBook(Book b) {
		booklist.add(b);
		
	}

	@Override
	public void deleteAllBooks() {
		booklist.clear();
		
	}

	@Override
	public Book findId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}