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

    public Dealership(String manufacturerRepresentative1, String manufacturerRepresentative2,
                      String manufacturerRepresentative3) {
        this.manufacturerRepresentative1 = manufacturerRepresentative1;
        this.manufacturerRepresentative2 = manufacturerRepresentative2;
        this.manufacturerRepresentative3 = manufacturerRepresentative2;
        newCars = new ArrayList<Car>();
        usedCar = new ArrayList<Car>();

    }

    public void addCar(Car car) {
        if (car.isNew()) {
            newCars.add(car);
        } else {
            usedCar.add(car);
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

    public void removeCar(Car car) {
        //TODO
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

    public ArrayList<Car> getNewCars() {
        return newCars;
    }

    public ArrayList<Car> getUsedCar() {
        return usedCar;
    }

    public ArrayList<Car> getCarsWithFastChargingTime() {
        ArrayList<Car> carWithFastCharging = new ArrayList<Car>();
        for (Car car : usedCar) {
            if (car.getChargingTime() <= 2) {
                carWithFastCharging.add(car);
            }

        }
        for (Car car : newCars) {
            if (car.getChargingTime() <= 2) {
                carWithFastCharging.add(car);
            }
        }
        return carWithFastCharging;
    }

  public ArrayList<Car> getCarsInStock(){
        ArrayList<Car>carsInStock=new ArrayList<Car>();
      for (Car car:usedCar) {
          if(getStockI3()>0){
              carsInStock.add(car);
          }else if(getStockFourTwo()>0){
              carsInStock.add(car);
          }else if(getStockFourFour()>0){
              carsInStock.add(car);
          }else if(getStockeGolf()>0){
              carsInStock.add(car);
          }else if(getStockeUP()>0){
              carsInStock.add(car);
          }else{
              System.out.println("Sorry we don't have any car in stock");
          }

      }
      return carsInStock;
  }
}
