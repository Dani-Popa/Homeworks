package car;

import model.*;
import java.util.ArrayList;

public class InitCar {

    /**
     * Create cars objects and add them to arrayList usedCars and newCars
     */
    public void initCars(){

        ArrayList<Car> usedCar = new ArrayList<Car>();
        ArrayList<Car> newCar = new ArrayList<Car>();

        /**
         * Create dealership object
         */
        Dealership dealership = new Dealership("BMW", "Volkswagen","Smart", usedCar, newCar);

        /**
         * Create I3 object
         */
        I3 i3 = new I3(125, 120, "BMW", "I3", 2016, 30000, 4, true, dealership, 170);
        I3 i3used = new I3(125, 120, "BMW", "I3", 2015, 25000, 4, false, dealership, 170);

        /**
         * Create eGolf object
         */
        eGolf egolf = new eGolf(120, 100, "Volkswagen", "eGolf", 2017, 30000, 4, true, dealership, 134);
        eGolf egolfused = new eGolf(120, 100, "Volkswagen", "eGolf", 2016, 20000, 4, false, dealership, 134);

        /**
         * Create eUP object
         */
        eUP eup = new eUP(130, 110, "Volkswagen", "eUp", 2017, 31000, 3, true, dealership, 130);
        eUP eupused = new eUP(130, 110, "Volkswagen", "eUp", 2016, 18000, 3, false, dealership, 130);

        /**
         * Create fourfour object
         */
        FourFour fourfour = new FourFour(60, 60, "Smart", "FourFour", 2015, 20000, 3, true, dealership, 90);
        FourFour fourfourused = new FourFour(60, 60, "Smart", "FourFour", 2014, 15000, 3, false, dealership, 90);

        /**
         * Create fourtwo object
         */
        FourTwo fourtwo=new FourTwo(70,70,"Smart","FourTwo",2016,25000,3,true,dealership,90);
        FourTwo fourtwoused=new FourTwo(70,70,"Smart","FourTwo",2015,20000,3,true,dealership,90);

        /**
         * Add cars in arrayList , usedCars and newCars
         */
        dealership.addCar(i3);
        dealership.addCar(i3);
        dealership.addCar(i3);
        dealership.addCar(i3);
        dealership.addCar(i3used);
        dealership.addCar(i3used);

        dealership.addCar(egolf);
        dealership.addCar(egolf);
        dealership.addCar(egolf);
        dealership.addCar(egolfused);
        dealership.addCar(egolfused);

        dealership.addCar(eup);
        dealership.addCar(eup);
        dealership.addCar(eup);
        dealership.addCar(eupused);
        dealership.addCar(eupused);

        dealership.addCar(fourfour);
        dealership.addCar(fourfour);
        dealership.addCar(fourfour);
        dealership.addCar(fourfourused);

        dealership.addCar(fourtwo);
        dealership.addCar(fourtwo);
        dealership.addCar(fourtwo);
        dealership.addCar(fourtwoused);
        dealership.addCar(fourtwoused);

/**
 * Get the stock from dealership
 */
        System.out.println("Stock i3 is: "+dealership.getStockI3());
        System.out.println("Stock eUP is: "+dealership.getStockeUP());
        System.out.println("Stock eGolf is: "+dealership.getStockeGolf());
        System.out.println("Stock FourFour is: "+dealership.getStockFourFour());
        System.out.println("Stock FourTwo is: "+dealership.getStockFourTwo());

        int count = newCar.size();
        System.out.println("newCar list: " + count);

        int count1 = usedCar.size();
        System.out.println("usedCar list: " + count1);
    }
}
