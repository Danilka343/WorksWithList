package Lesson_3.tasks;

import Lesson_3.domain.User;

import java.util.ArrayList;

public class FivethTask extends FourthTask {

    public void task5() {

        ArrayList<User> n = new ArrayList<>();
        User user = new User(1L, "Kolya", "Selyavonchik", n);
        User.generator(3, user); // Method generator with nesting = 3 by user

        System.out.println(user);
    }

}
