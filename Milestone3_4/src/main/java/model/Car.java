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

    public Car(int electricMotorCapacity, int energyConsuption, String manufacturer, String model, int productionYear, int price, int chargingTime, boolean isNew,int horsePower) {
        this.electricMotorCapacity = electricMotorCapacity;
        this.energyConsuption = energyConsuption;
        Manufacturer = manufacturer;
        Model = model;
        this.productionYear = productionYear;
        this.price = price;
        this.chargingTime = chargingTime;
        this.isNew = isNew;
        this.horsePower=horsePower;
    }

    public boolean isNew() {
        return isNew;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    public int getPrice() {
        return price;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public int getEnergyConsuption() {
        return energyConsuption;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "energyConsuption=" + energyConsuption +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", Model='" + Model + '\'' +
                ", price=" + price +
                ", horsePower=" + horsePower +
                '}';
    }
}
