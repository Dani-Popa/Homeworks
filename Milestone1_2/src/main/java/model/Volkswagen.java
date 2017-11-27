package model;

public class Volkswagen extends Car {
    private Dealership representative;

    public Volkswagen(int electricMotorCapacity, int energyConsuption, String manufacturer, String model, int productionYear, int price, boolean isNew,Dealership representative) {
        super(electricMotorCapacity, energyConsuption, manufacturer, model, productionYear, price, isNew);
        this.representative=representative;
    }
}
