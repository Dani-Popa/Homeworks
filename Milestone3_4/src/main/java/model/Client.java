package model;

import java.util.ArrayList;

public class Client {

    private String firstName;
    private String lastName;
    private int budget;

    public Client(String firstName, String lastName, int budget) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.budget = budget;
    }


    public void buyCarAtFullPrice(Car car, Dealership dealership) {
        if (budget >= car.getPrice() && dealership.getStockI3() > 0) {
            dealership.removeCar(car);
        } else {
            System.out.println("This client doesn't have enaugh money or the car is not in stock.");
        }
        if (budget >= car.getPrice() && dealership.getStockeUP() > 0) {
            dealership.removeCar(car);
        } else {
            System.out.println("This client doesn't have enaugh money or the car is not in stock.");
        }
        if (budget >= car.getPrice() && dealership.getStockeGolf() > 0) {
            dealership.removeCar(car);
        } else {
            System.out.println("This client doesn't have enaugh money or the car is not in stock.");
        }
        if (budget >= car.getPrice() && dealership.getStockFourFour() > 0) {
            dealership.removeCar(car);
        } else {
            System.out.println("This client doesn't have enaugh money or the car is not in stock.");
        }
        if (budget >= car.getPrice() && dealership.getStockFourTwo() > 0) {
            dealership.removeCar(car);
        } else {
            System.out.println("This client doesn't have enaugh money or the car is not in stock.");
        }
    }


    public void askForCarsWithFastCharging(Dealership dealership) {
        dealership.getCarsWithFastChargingTime(dealership.getAllCars());

    }

    public void askForCarsInStock(Dealership dealership) {
        dealership.getCarsInStock(dealership.getAllCars());
    }

    public void requestGreenBonusFromDealership(Dealership dealership) {
        dealership.getFixBudgetFromGreebBonusProgram();

    }

    public void buyCarUsingGreenBonus(Car car, Dealership dealership) {
        GreenBonusProgram gb = new GreenBonusProgram();
        int totalBudget = budget + gb.getFixBudget();
        boolean newCar;
        newCar = car.isNew();
        if (totalBudget >= car.getPrice() && newCar == true) {
            dealership.removeCar(car);
        } else {
            System.out.println("This client doesn't have enaugh money or this car is used.");
        }

    }
}
