package library.members;

public class Member {
    private int memberId;
    private String name;
    private int booksBorrowed;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.booksBorrowed = 0;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void incrementBooksBorrowed() {
        booksBorrowed++;
    }

    public void decrementBooksBorrowed() {
        if (booksBorrowed > 0) {
            booksBorrowed--;
        }
    }

    @Override
    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name + ", Books Borrowed: " + booksBorrowed;
    }
}
