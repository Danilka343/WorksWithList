package Lesson_3.domain;

import Lesson_3.data.RandomOfNameAndAuthor;

public class Book implements RandomOfNameAndAuthor {
    private int id;
    private String name;
    private String author;
    private String publisher;


    public Book(int id, String name, String author, String publisher) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    public Book(String name, String publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        return publisher != null ? publisher.equals(book.publisher) : book.publisher == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }


    @Override
    public String getRandomOfBookName() {
        String[] name = {"War", "Offroad", "BMW", "Road to the Dream", "Belarus", "Russia", "NASA", "It-Academy", "Planet", "Animals"};
        int a = (int) Math.floor(Math.random() * name.length);
        return name[a];
    }

    @Override
    public String getRandomOfName() {
        String[] author = {"Danil", "Alexei", "Nikita", "Slava", "Pushkin", "Lebedev", "Andrei"};
        int a = (int) Math.floor(Math.random() * author.length);
        return author[a];
    }
}
