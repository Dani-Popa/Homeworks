package model;

public class Smart extends Car {
    private Dealership representative;


    public Smart(int electricMotorCapacity, int energyConsuption, String manufacturer, String model, int productionYear, int price, int chargingTime, boolean isNew,Dealership representative) {
        super(electricMotorCapacity, energyConsuption, manufacturer, model, productionYear, price, chargingTime, isNew);
        this.representative=representative;
    }
}
