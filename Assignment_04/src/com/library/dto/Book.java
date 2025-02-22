package com.library.dto;
public class Book{
	private static int bookCount  = 0;
	private int bookId;
	private String title;
	private String ISBN;
	private String author;
	private String publisher;
	private int publicationYear;
	private double price;
	private int pages;
	
	public Book(int bookId,String title,String ISBN,String author,String publisher,int publicationYear,double price,int page){
		this.bookId = bookId;
		this.title = title;
		this.ISBN = ISBN;
		this.author = author;
		this.publisher = publisher;
		this.publicationYear = publicationYear;
		this.price = price;
		this.pages = pages;
		bookCount++;
	}
	public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
       	this.bookId = bookId;
    }
	
	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static int getBookCount() {
        return bookCount;
    }
	
	public void displayBookDetails(){
		System.out.println("Book Id          = " + this.bookId );	
		System.out.println("title            = " + this.title  );	
		System.out.println("ISBN             = " + this.ISBN );	
		System.out.println("Author           = " + this.author );	
		System.out.println("Publisher        = " + this.publisher );	
		System.out.println("Publication Year = " + this.publicationYear );	
		System.out.println("Price            = " + this.price );		
		System.out.println("Pages            = " + this.pages );		 
	}

}