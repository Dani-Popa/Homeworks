package model;

public class FourFour extends Smart {
    int stock;

    public FourFour(int electricMotorCapacity, int energyConsuption, String manufacturer, String model, int productionYear, int price, boolean isNew, Dealership representative,int stock) {
        super(electricMotorCapacity, energyConsuption, manufacturer, model, productionYear, price, isNew, representative);
        this.stock=stock;
    }
}
