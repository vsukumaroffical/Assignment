package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public void borrowBook(Member member, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            member.incrementBooksBorrowed();
            System.out.println(member.getName() + " borrowed \"" + book.getTitle() + "\".");
        } else {
            System.out.println("The book \"" + book.getTitle() + "\" is currently not available.");
        }
    }

    public void returnBook(Member member, Book book) {
        if (!book.isAvailable()) {
            book.setAvailable(true);
            member.decrementBooksBorrowed();
            System.out.println(member.getName() + " returned \"" + book.getTitle() + "\".");
        } else {
            System.out.println("The book \"" + book.getTitle() + "\" was not borrowed.");
        }
    }
}
