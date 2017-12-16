package model;

import java.util.ArrayList;

public class Dealership {

    private String manufacturerRepresentative1;
    private String manufacturerRepresentative2;
    private String manufacturerRepresentative3;
    private ArrayList<Car> newCars;
    private ArrayList<Car> usedCar;
    private int stockI3;
    private int stockeUP;
    private int stockeGolf;
    private int stockFourFour;
    private int stockFourTwo;

    public Dealership(String manufacturerRepresentative1, String manufacturerRepresentative2,String manufacturerRepresentative3, ArrayList<Car> newCars, ArrayList<Car> usedCar) {
        this.manufacturerRepresentative1 = manufacturerRepresentative1;
        this.manufacturerRepresentative2 = manufacturerRepresentative2;
        this.manufacturerRepresentative3=manufacturerRepresentative2;
        this.newCars = newCars;
        this.usedCar = usedCar;
    }

    public void addCar(Car car) {
        if (car.isNew()) {
            usedCar.add(car);
        } else {
            newCars.add(car);
        }
        if (car instanceof I3) {
            stockI3++;
        } else if (car instanceof eUP) {
            stockeUP++;
        } else if (car instanceof eGolf) {
            stockeGolf++;
        } else if (car instanceof FourFour) {
            stockFourFour++;
        } else if (car instanceof FourTwo) {
            stockFourTwo++;
        } else {
            System.out.println("I don't have this type of car. ");
        }
    }

    public int getStockI3() {
        return stockI3;
    }

    public int getStockeUP() {
        return stockeUP;
    }

    public int getStockeGolf() {
        return stockeGolf;
    }

    public int getStockFourFour() {
        return stockFourFour;
    }

    public int getStockFourTwo() {
        return stockFourTwo;
    }
}
