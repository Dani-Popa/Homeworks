package model;

import java.util.ArrayList;

public class Dealership extends ArrayList<Car> {

    private String manufacturerRepresentative1;
    private String manufacturerRepresentative2;
    private String manufacturerRepresentative3;
    private ArrayList<Car> newCars;
    private ArrayList<Car> usedCar;
    private ArrayList<Car> allCars;
    private int stockI3;
    private int stockeUP;
    private int stockeGolf;
    private int stockFourFour;
    private int stockFourTwo;
    private int number;

    public Dealership(String manufacturerRepresentative1, String manufacturerRepresentative2,
                      String manufacturerRepresentative3) {
        this.manufacturerRepresentative1 = manufacturerRepresentative1;
        this.manufacturerRepresentative2 = manufacturerRepresentative2;
        this.manufacturerRepresentative3 = manufacturerRepresentative2;
        newCars = new ArrayList<Car>();
        usedCar = new ArrayList<Car>();
        allCars = new ArrayList<Car>();
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

    /**
     * Add all cars in the same list
     *
     * @param car
     */
    public void addAllCarrInTheSameList(Car car) {
        allCars.add(car);
    }

    public void removeCar(Car car) {
        allCars.remove(car);

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

    public ArrayList<Car> getAllCars() {
        return allCars;
    }


    public ArrayList<Car> getCarsWithFastChargingTime(ArrayList<Car> allCars) {
        ArrayList<Car> carWithFastCharging = new ArrayList<Car>();
        for (Car car : allCars) {
            if (car.getChargingTime() <= 2) {
                carWithFastCharging.add(car);
            }
        }
        return carWithFastCharging;
    }


    public ArrayList<Car> getCarsInStock(ArrayList<Car> allCars) {
        ArrayList<Car> carsInStock = new ArrayList<Car>();
        for (Car car : allCars) {
            if (getStockI3() > 0) {
                carsInStock.add(car);
            } else if (getStockFourTwo() > 0) {
                carsInStock.add(car);
            } else if (getStockFourFour() > 0) {
                carsInStock.add(car);
            } else if (getStockeGolf() > 0) {
                carsInStock.add(car);
            } else if (getStockeUP() > 0) {
                carsInStock.add(car);
            } else {
                System.out.println("Sorry we don't have any car in stock");
            }

        }
        return carsInStock;
    }

    public ArrayList<Car> sortCarsPrice(ArrayList<Car> allCars) {
        if (allCars.size() <= 1) {
            return allCars;
        }
        int mid = allCars.size() / 2;
        Car pivot = allCars.get(mid);

        ArrayList<Car> less = new ArrayList<Car>();
        ArrayList<Car> greater = new ArrayList<Car>();

        for (int i = 0; i < allCars.size(); i++) {
            if (allCars.get(i).getPrice() <= pivot.getPrice()) {
                if (i == mid) {
                    continue;
                }
                less.add(allCars.get(i));
            } else {
                greater.add(allCars.get(i));
            }
        }
        return concatenate(sortCarsPrice(less), pivot, sortCarsPrice(greater));
    }

    public ArrayList<Car> sortCarsEnergyConsuption(ArrayList<Car> allCars) {
        if (allCars.size() <= 1) {
            return allCars;
        }
        int mid = allCars.size() / 2;
        Car pivot = allCars.get(mid);

        ArrayList<Car> less = new ArrayList<Car>();
        ArrayList<Car> greater = new ArrayList<Car>();

        for (int i = 0; i < allCars.size(); i++) {
            if (allCars.get(i).getEnergyConsuption() <= pivot.getEnergyConsuption()) {
                if (i == mid) {
                    continue;
                }
                less.add(allCars.get(i));
            } else {
                greater.add(allCars.get(i));
            }
        }
        return concatenate(sortCarsEnergyConsuption(less), pivot, sortCarsEnergyConsuption(greater));
    }

    public ArrayList<Car> sortHorsePower(ArrayList<Car> allCars) {
        if (allCars.size() <= 1) {
            return allCars;
        }
        int mid = allCars.size() / 2;
        Car pivot = allCars.get(mid);

        ArrayList<Car> less = new ArrayList<Car>();
        ArrayList<Car> greater = new ArrayList<Car>();

        for (int i = 0; i < allCars.size(); i++) {
            if (allCars.get(i).getHorsePower() <= pivot.getHorsePower()) {
                if (i == mid) {
                    continue;
                }
                less.add(allCars.get(i));
            } else {
                greater.add(allCars.get(i));
            }
        }
        return concatenate(sortHorsePower(less), pivot, sortHorsePower(greater));
    }

    private ArrayList<Car> concatenate(ArrayList<Car> less, Car pivot, ArrayList<Car> greater) {
        ArrayList<Car> list = new ArrayList<Car>();
        for (int i = 0; i < less.size(); i++) {
            list.add(less.get(i));
        }
        list.add(pivot);
        for (int i = 0; i < greater.size(); i++) {
            list.add(greater.get(i));
        }
        return list;
    }

public void getFixBudgetFromGreebBonusProgram(){
    GreenBonusProgram gb=new GreenBonusProgram();
    gb.getFixBudget();
}


}

