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


    public void buyCarAtFullPrice(Car car, Dealership dealership){
        if (budget>car.getPrice()){
            dealership.removeCar(car);
        }else{
            System.out.println("This client doesn't have enaugh money");
        }
    }

    public void askForCarsWithFastCharging(Dealership dealership) {
        dealership.getCarsWithFastChargingTime();
    }
    public void askForCarsInStock(Dealership dealership){
        dealership.getCarsInStock();
    }
}
