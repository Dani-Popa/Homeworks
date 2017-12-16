package model;

public class eUP extends Volkswagen{
    private int horsePower;

    public eUP(int electricMotorCapacity, int energyConsuption, String manufacturer, String model, int productionYear, int price, int chargingTime, boolean isNew, Dealership representative,int horsePower) {
        super(electricMotorCapacity, energyConsuption, manufacturer, model, productionYear, price, chargingTime, isNew, representative);
        this.horsePower=horsePower;
    }
}

