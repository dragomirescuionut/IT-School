package session13_recap.Challenges.LibraryManagementSystem;

import java.util.List;
import java.util.UUID;

public interface LibraryQuery {
    void displayAllBooks();

    List<Book> findBookByTitle(String title);

    List<Book> findBookByAuthor(String Author);

    List<Book> findBookByIsbn(String isbn);

    void displayAllMembers();

    void findMemberByName(String name);

    void findMemberByID(String memberID);

}