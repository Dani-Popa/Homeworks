package model;

public class eUP extends Volkswagen{
    private int stock;

    public eUP(int electricMotorCapacity, int energyConsuption, String manufacturer, String model, int productionYear, int price, boolean isNew, Dealership representative,int stock) {
        super(electricMotorCapacity, energyConsuption, manufacturer, model, productionYear, price, isNew, representative);
        this.stock=stock;
    }
}
