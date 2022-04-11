package Lesson_3.tasks;


import Lesson_3.domain.Book;

import java.util.HashSet;


public class SecondTask {
    public void task2() {
        HashSet<Book> hashSet = new HashSet<>(); //Cоздаем hashSet класса Book

        for (int i = 1; i <= 6; i++) {
            hashSet.add(new Book("Belarus", "4"));  //6 HashSet with the same Name and Publisher
        }
        hashSet.forEach(b -> System.out.println(    //Output to HashSet and see only 1 list
                b.getName() + " "
                        + b.getPublisher()));
    }
}
