package session13_recap.challenges.libraryManagementSystem;

import java.util.UUID;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private UUID isbn;
    private int numberOfCopies;

    public Book(String title, String author, String publisher, UUID isbn, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.numberOfCopies = numberOfCopies;
    }

    public void addCopy() {
        numberOfCopies++;
    }

    public void removeCopy() {
        this.numberOfCopies--;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + "\nauthor: " + author + "\nISBN: " + isbn + "\nnumber of copies:" + numberOfCopies);
    }

    public boolean isAvailable() {
        return numberOfCopies > 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public UUID getIsbn() {
        return isbn;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}