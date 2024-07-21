package com.trs.second_springbootv1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trs.second_springbootv1.model.Book;
import com.trs.second_springbootv1.service.BookServiceImpl;
@RestController 
public class BookController {
	
	@Autowired 
	BookServiceImpl bookServiceImpl;
	
	@PostMapping
	public void addBook(@RequestBody Book book) {
		bookServiceImpl.addBook(book);
	}
	@GetMapping("/find_by_id/(biikid)")
	public Book getBookById1(@PathVariable long bookid) {
		return bookServiceImpl.findById(bookid);
	}
	@GetMapping("/find_by_id/(biikid)")
	public Book getBookById(@PathVariable long bookid) {
		return bookServiceImpl.findById(bookid);
	}
	@DeleteMapping("/delete")
	public void deleteAllBooks() {
		bookServiceImpl.deleteAllBooks();
	}
}
	

