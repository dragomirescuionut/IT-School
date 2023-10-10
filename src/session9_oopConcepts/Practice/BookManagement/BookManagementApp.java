package session9_oopConcepts.Practice.BookManagement;

public class BookManagementApp {

    public static void main(String[] args) {
        Author authorAlice = new Author("Alice");
        Book book1 = new Book("Book Book", authorAlice);

        System.out.println("Book title: " + book1.getTitle());
        System.out.println("Book author: " + book1.getAuthorName());
    }
}