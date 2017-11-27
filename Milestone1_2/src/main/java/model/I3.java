package model;

public class I3 extends BMW{
    private int stock;

    public I3(int electricMotorCapacity, int energyConsuption, String manufacturer, String model, int productionYear, int price, boolean isNew, Dealership representative,int stock) {
        super(electricMotorCapacity, energyConsuption, manufacturer, model, productionYear, price, isNew, representative);
        this.stock=stock;
    }
}
