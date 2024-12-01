package com.library.storage;

import java.util.*;
import com.library.dto.Book;

public class BookStorage{
	private static BookStorage instance ;
	private static Map<Integer,Book> books = new HashMap<>();
	
	private BookStorage(){
		
	}
	public static BookStorage getInstance(){
		if(instance == null){
			instance = new BookStorage();
		}
		return instance;
	}
	public void insertBook(Book newBook){
		books.put(newBook.getBookId(),newBook);
	}
	
	public List<Book> getBookList() {
		return new ArrayList<>(books.values());
	}
	
}