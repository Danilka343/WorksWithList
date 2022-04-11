package Lesson_2;

import java.util.Objects;

public class Car implements BrandsOfCars, ModelOfCars, Mooving, Comparable<Car> {
    private int brakePads;
    private int wheels;
    private int steeringWheel;
    private int doors;
    private double engineVolume;
    private String carBrand;
    private String carModel;


    public Car() {
        this.brakePads = 4;
        this.wheels = 4;
        this.steeringWheel = 1;
        this.doors = 5;
        this.engineVolume = 3.0;
        this.carBrand = getRandomOfBrands(); // assigning a random car brand.
        this.carModel = getRandomOfModel();  // assigning a random car model.
    }

    public Car(int brakePads, int steeringWheel, int doors, String brandCar, double engineVolume, String autoModel, int wheels) {
        this.brakePads = brakePads;
        this.steeringWheel = steeringWheel;
        this.doors = doors;
        this.carBrand = brandCar;
        this.engineVolume = engineVolume;
        this.carModel = autoModel;
        this.wheels = wheels;
    }

    public Car(String brandCar, String autoModel, double engineVolume) {
        this.carBrand = brandCar;
        this.carModel = autoModel;
        this.engineVolume = engineVolume;

    }

    public Car(double engineVolume, String autoModel) {
        this.engineVolume = engineVolume;
        this.carModel = autoModel;
    }

    public int getBrakePads() {
        return brakePads;
    }

    public void setBrakePads(int brakePads) {
        this.brakePads = brakePads;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(int steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (brakePads != car.brakePads) return false;
        if (wheels != car.wheels) return false;
        if (steeringWheel != car.steeringWheel) return false;
        if (doors != car.doors) return false;
        if (Double.compare(car.engineVolume, engineVolume) != 0) return false;
        if (!Objects.equals(carBrand, car.carBrand)) return false;
        return Objects.equals(carModel, car.carModel);
    }


    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brakePads;
        result = 31 * result + wheels;
        result = 31 * result + steeringWheel;
        result = 31 * result + doors;
        temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (carBrand != null ? carBrand.hashCode() : 0);
        result = 31 * result + (carModel != null ? carModel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brakePads=" + brakePads +
                ", wheels=" + wheels +
                ", steeringWheel=" + steeringWheel +
                ", doors=" + doors +
                ", engineVolume=" + engineVolume +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Yeeees, we are mooving!!");
    }  //overriding study results

    @Override
    public void run() {
        System.out.println("Nice, we running!!!");

    }

    @Override
    public String getRandomOfBrands() {
        int b = (int) Math.floor(Math.random() * Brands.length);
        return Brands[b];
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
