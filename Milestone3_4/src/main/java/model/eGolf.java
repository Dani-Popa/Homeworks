package model;

public class eGolf extends Volkswagen {
    private int horsePower;


    public eGolf(int electricMotorCapacity, int energyConsuption, String manufacturer, String model, int productionYear, int price, int chargingTime, boolean isNew, Dealership representative,int horsePower) {
        super(electricMotorCapacity, energyConsuption, manufacturer, model, productionYear, price, chargingTime, isNew, representative);
        this.horsePower=horsePower;
    }
}