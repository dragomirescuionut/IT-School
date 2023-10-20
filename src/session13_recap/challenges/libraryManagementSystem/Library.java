package session13_recap.challenges.libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Library implements LibraryManagement, LibraryQuery {
    private List<Book> books;
    private List<Member> members;

    public Library(List<Book> books, List<Member> members) {
        this.books = books;
        this.members = members;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public void addMember(Member member) {
        members.add(member);
    }

    @Override
    public void removeMember(Member member) {
        members.remove(member);
    }

    @Override
    public void displayAllBooks() {
        System.out.println("All books in the library: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                results.add(book);
            }
        }
        return results;
    }

    @Override
    public List<Book> findBookByAuthor(String author) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                results.add(book);
            }
        }
        return results;
    }

    @Override
    public List<Book> findBookByIsbn(UUID isbn) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getIsbn().toString().equalsIgnoreCase(isbn.toString())) {
                results.add(book);
            }
        }
        return results;
    }

    @Override
    public void displayAllMembers() {
        System.out.println("All library members: ");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    @Override
    public void findMemberByName(String name) {
        System.out.println("Find member by Name: ");
        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                System.out.println(member);
            }
        }
    }

    @Override
    public void findMemberByID(String memberID) {
        System.out.println("Find member by ID: ");
        for (Member member : members) {
            if (member.getMemberID().equalsIgnoreCase(memberID)) {
                System.out.println(member);
            }
        }
    }

}