package model;

public class FourTwo extends Smart {
    private int stock;

    public FourTwo(int electricMotorCapacity, int energyConsuption, String manufacturer, String model, int productionYear, int price, boolean isNew, Dealership representative,int stock) {
        super(electricMotorCapacity, energyConsuption, manufacturer, model, productionYear, price, isNew, representative);
        this.stock=stock;
    }
}
