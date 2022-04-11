package Lesson_2;

public class objCar {
    public static Car[] generateCars(int count) {

        Car[] cars = new Car[count];        //method for generating machines by the input parameter count.
        for (int i = 0; i < count; i++) {
            cars[i] = new Car();
        }
        return cars;
    }
}
