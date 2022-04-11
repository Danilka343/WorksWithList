package Lesson_3.tasks;

import Lesson_3.data.RandomOfNameAndAuthor;
import Lesson_3.domain.Book;

import java.util.LinkedList;
import java.util.List;

public class FirstTask implements RandomOfNameAndAuthor {

    public void task1() {

        List<Book> linkedBook = new LinkedList<>();

        for (int i = 1; i <= 20; i++) {                 //20 Lists with random BookNames and Authors
            linkedBook.add(new Book(i, getRandomOfBookName(), getRandomOfAuthor(), "Danil"));
        }

        System.out.println("Until element 7 is removed");
        linkedBook.forEach(b -> System.out.println(
                b.getId() +
                        " BookName - " + b.getRandomOfBookName() +
                        " ,Author - " + b.getRandomOfAuthor() +
                        " ,Publisher -  " + b.getPublisher()));

        linkedBook.remove(7);   //remove element from index 7
        System.out.println("\nAfter removing item 7\n");
        linkedBook.forEach(b -> System.out.println(
                b.getId() +
                        " BookName - " + b.getRandomOfBookName() +
                        " ,Author - " + b.getRandomOfAuthor() +
                        " ,Publisher -  " + b.getPublisher()));
    }


    @Override
    public String getRandomOfBookName() {
        return null;
    }

    @Override
    public String getRandomOfAuthor() {
        return null;
    }

}
