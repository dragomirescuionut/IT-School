package session13_recap.challenges.libraryManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LibraryManagementApp {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        List<Member> members = new ArrayList<>();
        Library library = new Library(books, members);

        //creating authors objects
        Author author1 = new Author("Harper Lee", "American", LocalDate.of(1900,03,24));
        Author author2 = new Author("Frank Herbert", "American", LocalDate.of(1920,03,12));

        //creating book objects
        Book book1 = new Book("To Kill a Mockingbird", author1.getName(), "HarperCollins Publishers", UUID.randomUUID(), 6);
        Book book2 = new Book("Go Set a Watchman", author1.getName(), "HarperCollins Publishers", UUID.randomUUID(), 10);
        Book book3 = new Book("Dune", author2.getName(), "Chilton Books", UUID.randomUUID(), 15);

        //adding books into library books list
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        System.out.println("Find book by Author Name: \n" + library.findBookByAuthor("Harper Lee"));
        System.out.println("Find books by isbn: \n" + library.findBookByIsbn(book2.getIsbn()));
        System.out.println("Find book by Title: \n" + library.findBookByTitle("Dune"));
        library.displayAllBooks();
        System.out.println("\n");

        book1.addCopy();
        book2.removeCopy();
        library.removeBook(book1);
        library.displayAllBooks();
        System.out.println("\n");

        //creating and adding members into library members list
        Member member1 = new Member("Jonathan", "Groove Street", "jonsmith@mail.com", "ID-001");
        Member member2 = new Member("Smith", "Tree Street", "smith_thomson@mail.com", "ID-002");
        Member member3 = new Member("Susan", "1st Avenue", "sussan03@abc.com", "ID-003");
        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);
        library.removeMember(member2);


        library.displayAllMembers();
        library.findMemberByID("ID-001");
        library.findMemberByName("Susan");

        member1.borrowBook(book1); // this is not modifying numbers of copies :(
        member1.displayBorrowedBooks();
        member1.returnBook(book1);
        member1.displayBorrowedBooks();
    }
}