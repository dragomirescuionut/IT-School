package session13_recap.challenges.libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String address;
    private String contactInfo;
    private String memberID;
    private List<Book> borrowedBooks = new ArrayList<>();


    public void borrowBook(Book book) {
        if (book.getNumberOfCopies() != 0) {
            borrowedBooks.add(book);
            book.removeCopy();
        } else {
            System.out.println("Not enough copies! ");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
        } else {
            System.out.println("Please enter a borrowed book! ");
        }
    }
    public void displayBorrowedBooks(){
        System.out.println("Your borrowed books are: ");
        for(Book book : borrowedBooks){
            System.out.println(book);
        }
    }

    public Member(String name, String address, String contactInfo, String memberID) {
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getMemberID() {
        return memberID;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", memberID='" + memberID + '\'' +
                '}';
    }
}