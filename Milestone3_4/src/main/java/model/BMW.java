package model;

public class BMW extends Car{
    private Dealership representative;


    public BMW(int electricMotorCapacity, int energyConsuption, String manufacturer, String model, int productionYear, int price, int chargingTime, boolean isNew,Dealership representative) {
        super(electricMotorCapacity, energyConsuption, manufacturer, model, productionYear, price, chargingTime, isNew);
        this.representative=representative;
    }
}
