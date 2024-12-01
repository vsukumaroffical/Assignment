import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryManagementSystem {
    public static void main(String[] args) {
     
        Book book1 = new Book("Ponniyin Selvan", "Kalki");
        Book book2 = new Book("Agni Siragugal", "APJ Abdul Kalam");

        
        Member member1 = new Member(101, "Sukumar");
        Member member2 = new Member(102, "Arun");

        
        Transaction transaction = new Transaction();

        
        transaction.borrowBook(member1, book1);
        transaction.borrowBook(member2, book1);  
        transaction.returnBook(member1, book1);
        transaction.borrowBook(member2, book1);  

        System.out.println("\nBook Details:");
        System.out.println(book1);
        System.out.println(book2);

        System.out.println("\nMember Details:");
        System.out.println(member1);
        System.out.println(member2);
    }
}
