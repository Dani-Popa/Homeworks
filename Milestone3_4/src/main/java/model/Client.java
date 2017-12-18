package model;

public class Client {

    private String firstName;
    private String lastName;
    private int budget;

    public Client(String firstName, String lastName, int budget) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.budget = budget;
    }

    public void buyCar(Car car, Dealership dealership) {
        dealership.removeCar(car);
        if (budget > car.getPrice()) {

            budget = budget - car.getPrice();
        } else {
            System.out.println("This client doesn't have enough money");
        }
    }

    public void askForCarsWithFastCharging(Dealership dealership) {
        dealership.getCarsWithFastChargingTime();
    }
    public void askForCarsInStock(Dealership dealership){
        dealership.getCarsInStock();
    }
}
