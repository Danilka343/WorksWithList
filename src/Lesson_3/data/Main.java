package Lesson_3.data;

import Lesson_3.tasks.FirstTask;
import Lesson_3.tasks.FivethTask;
import Lesson_3.tasks.FourthTask;
import Lesson_3.tasks.SecondTask;
import Lesson_3.tasks.ThirdTask;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nFIRST TASK\n");
        FirstTask asd = new FirstTask();
        asd.task1();

        System.out.println("\nSECOND TASK\n");
        SecondTask secondTask = new SecondTask();
        secondTask.task2();

        System.out.println("\nTHIRD TASK\n");
        ThirdTask thirdTask = new ThirdTask();
        thirdTask.task3();

        System.out.println("\nFOURTH TASK\n");
        FourthTask fourthTask = new FourthTask();
        fourthTask.task4();

        System.out.println("\nFIVETH TASK");
        FivethTask fivethTask = new FivethTask();
        fivethTask.task5();
    }

}
