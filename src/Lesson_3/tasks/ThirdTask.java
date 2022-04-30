package Lesson_3.tasks;

import Lesson_3.domain.Book;
import Lesson_3.sortings.SortByAuthor;
import Lesson_3.sortings.SortByName;
import Lesson_3.sortings.SortByPublisher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThirdTask implements Comparator<Book> {
    public void task3() {

        List<Book> linkedBook = new ArrayList<Book>();

        for (int i = 1; i <= 5; i++) {  //Create 5 identical ArrayLists
            linkedBook.add(new Book(i, "Mama", "Dima", "Danil"));
        }

        linkedBook.add(new Book(2, "Antarctida", "Angelina", "Anonim"));
        linkedBook.add(new Book(3, "Georgia", "Boris", "Sofiya"));
        linkedBook.add(new Book(4, "Beef", "Natali", "Dima"));
        linkedBook.add(new Book(5, "Workout", "Dubrovskiy", "Zheka"));

        System.out.println("Sort by Name!!!\n");

        Collections.sort(linkedBook, new SortByName()); //Sorting Collecion by Name
        linkedBook.forEach(b -> System.out.println(
                b.getId() +
                        " BookName - " + b.getName() +
                        " ,Author - " + b.getAuthor() +
                        " ,Publisher -  " + b.getPublisher()));
        System.out.println("\n----------------------------------------------\n");

        System.out.println("Sort by Author!!!\n");
        Collections.sort(linkedBook,
                new SortByAuthor()); //Sorting Collecion by Author
        linkedBook.forEach(b -> System.out.println(
                b.getId() +
                        " BookName - " + b.getName() +
                        " ,Author - " + b.getAuthor() +
                        " ,Publisher -  " + b.getPublisher()));
        System.out.println("\n----------------------------------------------\n");


        System.out.println("Sort by Publisher!!!\n");
        Collections.sort(linkedBook, new SortByPublisher()); //Sorting Collecion by Publisher

        linkedBook.forEach(b -> System.out.println(
                b.getId() +
                        " BookName - " + b.getName() +
                        " ,Author - " + b.getAuthor() +
                        " ,Publisher -  " + b.getPublisher()));
    }

    @Override
    public int compare(Book o1, Book o2) {
        return 0;
    }
}
