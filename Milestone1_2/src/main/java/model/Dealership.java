package model;

import java.util.ArrayList;

public class Dealership {
    private String manufacturerRepresentative1;
    private String manufacturerRepresentative2;
    private ArrayList<Car>newCars;
    private ArrayList<Car>usedCar;


    public Dealership(String manufacturerRepresentative1, ArrayList<Car> newCars, ArrayList<Car> usedCar) {
        this.manufacturerRepresentative1 = manufacturerRepresentative1;
        this.newCars = newCars;
        this.usedCar = usedCar;
    }

    public Dealership(String manufacturerRepresentative1, String manufacturerRepresentative2, ArrayList<Car> newCars, ArrayList<Car> usedCar) {
        this.manufacturerRepresentative1 = manufacturerRepresentative1;
        this.manufacturerRepresentative2 = manufacturerRepresentative2;
        this.newCars = newCars;
        this.usedCar = usedCar;
    }
}
