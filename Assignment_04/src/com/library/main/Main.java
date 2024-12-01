package com.library.main;

import com.library.dto.Book;
import com.library.storage.BookStorage;
import java.util.*;
public class Main {

	public void loadDefaultBooks(){
	   
       BookStorage.getInstance().insertBook(new Book(1, "Effective Java", "978-0134685991", "Joshua Bloch", "Addison-Wesley", 2018, 45.00, 412));
       BookStorage.getInstance().insertBook(new Book(2, "Clean Code", "978-0132350884", "Robert C. Martin", "Prentice Hall", 2008, 42.35, 464));
       BookStorage.getInstance().insertBook(new Book(3, "Java: The Complete Reference", "978-1260440232", "Herbert Schildt", "McGraw-Hill", 2018, 55.00, 1248));
       BookStorage.getInstance().insertBook(new Book(4, "Head First Design Patterns", "978-0596007126", "Eric Freeman", "O'Reilly Media", 2004, 58.99, 694));
       BookStorage.getInstance().insertBook(new Book(5, "Introduction to Algorithms", "978-0262033848", "Thomas H. Cormen", "MIT Press", 2009, 90.00, 1312));
    
	}
	public static void main(String args[]){
		new Main().loadDefaultBooks();
		List<Book> books = BookStorage.getInstance().getBookList(); 
		for(Book book : books) {
				book.displayBookDetails();
		}
	}

}