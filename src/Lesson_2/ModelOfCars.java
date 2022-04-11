package Lesson_2;

public interface ModelOfCars {

    String[] Model = {"M5", "S63", "Model 3", "Q7", "A6", "Sportage", "Quashqua", "Omega", "911", "RAV 4", "Kuliman" };

    default String getRandomOfModel(){                              //method declared in the default method.
        int a = (int) Math.floor(Math.random() * Model.length);
        return Model[a];
    }
}
