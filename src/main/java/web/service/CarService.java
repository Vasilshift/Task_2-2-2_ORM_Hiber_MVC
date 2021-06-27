package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> listCar = new ArrayList<>();

    public List<Car> getlistCars() {
        Car car1 = new Car("Tesla", "5", "190");
        Car car2 = new Car("Tesla", "6", "200");
        Car car3 = new Car("Tesla", "7", "210");
        Car car4 = new Car("BMW", "8", "220");
        Car car5 = new Car("Toyota", "9", "230");

        listCar.add(car1);
        listCar.add(car2);
        listCar.add(car3);
        listCar.add(car4);
        listCar.add(car5);

        return listCar;
    }
}
