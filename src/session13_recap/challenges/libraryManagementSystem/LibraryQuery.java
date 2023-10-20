package session13_recap.challenges.libraryManagementSystem;

import java.util.List;
import java.util.UUID;

public interface LibraryQuery {
    void displayAllBooks();

    List<Book> findBookByTitle(String title);

    List<Book> findBookByAuthor(String Author);

    List<Book> findBookByIsbn(UUID isbn);

    void displayAllMembers();

    void findMemberByName(String name);

    void findMemberByID(String memberID);

}