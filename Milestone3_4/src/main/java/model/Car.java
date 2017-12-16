package model;

public class Car {
    private int electricMotorCapacity;
    private int energyConsuption;
    private String Manufacturer;
    private String Model;
    private int productionYear;
    private int price;
    private int chargingTime;
    private boolean isNew;
    private int horsePower;

    public Car(int electricMotorCapacity, int energyConsuption, String manufacturer, String model, int productionYear, int price, int chargingTime, boolean isNew) {
        this.electricMotorCapacity = electricMotorCapacity;
        this.energyConsuption = energyConsuption;
        Manufacturer = manufacturer;
        Model = model;
        this.productionYear = productionYear;
        this.price = price;
        this.chargingTime = chargingTime;
        this.isNew = isNew;
    }

    public  boolean isNew() {
        return isNew;
    }
}
