package session9_oop_concepts.Practice.BookManagement;

public class Book {

    private String title;
    public Author author;

    public Book(String title, Author author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthorName(){
        return author.getName();
    }

}