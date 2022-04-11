package Lesson_3.tasks;

import Lesson_3.domain.Student;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FourthTask {

    public static void task4() {

        Set<Student> treeSet = new TreeSet<Student>();

        treeSet.add(new Student(1, "Nikolai", "Sergeevich", 7));
        treeSet.add(new Student(5, "Dima", "Igorevich", 8));
        treeSet.add(new Student(3, "Maxim", "Vladimirovich", 3));
        treeSet.add(new Student(6, "Oleg", "Alexeevich", 5));

        Iterator<Student> i = treeSet.iterator(); //Create Iterator from Collection
        while (i.hasNext()) {
            i.next();
            System.out.println(i.next()); //Sout even Collections
        }
//        treeSet.forEach(b -> System.out.println(b.getStudentId() +
//                " " + b.getName() +
//                    " " + b.getLastName() +
//                        " " + b.getAverageMark()));
    }

}