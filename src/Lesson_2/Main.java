package Lesson_2;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {

        Car[] cars = objCar.generateCars(10);
        Arrays.sort(cars);                           //Sorting of our massive.
        for (Car car : cars) {
            System.out.println(car);
            car.run();
            car.move();
        }
    }
}
