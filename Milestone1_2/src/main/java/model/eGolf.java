package model;

public class eGolf extends Volkswagen {
    private int stock;

    public eGolf(int electricMotorCapacity, int energyConsuption, String manufacturer, String model, int productionYear, int price, boolean isNew, Dealership representative,int stock) {
        super(electricMotorCapacity, energyConsuption, manufacturer, model, productionYear, price, isNew, representative);
        this.stock=stock;
    }
}
