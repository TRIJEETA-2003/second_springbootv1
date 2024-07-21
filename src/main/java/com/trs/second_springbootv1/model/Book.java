package com.trs.second_springbootv1.model;

import java.util.Objects;

public class Book {
	private int bookid;
	private String title;
	private String author;
	public Book() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bookid == other.bookid;
	}
	public int getBookid() {
		return bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + "]";
	}
	

}
