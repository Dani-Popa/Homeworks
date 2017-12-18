import model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * Create dealership object
         */
        Dealership dealership = new Dealership("BMW", "Volkswagen","Smart");

        /**
         * Create I3 object
         */
        I3 i3 = new I3(125, 120, "BMW", "I3", 2016, 30000, 4, true, 170);
        I3 i32 = new I3(125, 125, "BMW", "I3", 2015, 28000, 3, true, 170);
        I3 i33 = new I3(125, 120, "BMW", "I3", 2016, 30000, 2, true, 160);
        I3 i34 = new I3(125, 110, "BMW", "I3", 2017, 35000, 1, true, 170);
        I3 i35 = new I3(125, 120, "BMW", "I3", 2016, 30000, 3, true, 170);

        I3 i3used = new I3(125, 130, "BMW", "I3", 2015, 25000, 4, false,  170);
        I3 i3used1 = new I3(125, 125, "BMW", "I3", 2015, 25000, 3, false,  170);
        /**
         * Create eGolf object
         */
        eGolf egolf = new eGolf(120, 100, "Volkswagen", "eGolf", 2017, 30000, 2, true, 134);
        eGolf egolf1 = new eGolf(120, 110, "Volkswagen", "eGolf", 2016, 28000, 4, true, 134);
        eGolf egolf2 = new eGolf(120, 115, "Volkswagen", "eGolf", 2015, 27000, 3, true, 134);
        eGolf egolf3 = new eGolf(120, 100, "Volkswagen", "eGolf", 2017, 30000, 2, true, 134);

        eGolf egolfused = new eGolf(120, 150, "Volkswagen", "eGolf", 2016, 20000, 3, false, 134);
        eGolf egolfused1 = new eGolf(120, 120, "Volkswagen", "eGolf", 2015, 18000, 4, false, 134);
        eGolf egolfused2 = new eGolf(120, 110, "Volkswagen", "eGolf", 2016, 20000, 3, false, 134);

        /**
         * Create eUP object
         */
        eUP eup = new eUP(130, 115, "Volkswagen", "eUp", 2017, 31000, 2, true, 130);
        eUP eup1 = new eUP(130, 110, "Volkswagen", "eUp", 2017, 30000, 3, true, 130);
        eUP eup2 = new eUP(130, 110, "Volkswagen", "eUp", 2017, 30000, 2, true, 130);

        eUP eupused = new eUP(130, 130, "Volkswagen", "eUp", 2016, 18000, 3, false, 130);
        eUP eupused1 = new eUP(130, 130, "Volkswagen", "eUp", 2016, 18000, 3, false, 130);

        /**
         * Create fourfour object
         */
        FourFour fourfour = new FourFour(110, 100, "Smart", "FourFour", 2015, 15000, 1, true,  90);
        FourFour fourfour1 = new FourFour(110, 90, "Smart", "FourFour", 2015, 15000, 2, true,  90);
        FourFour fourfour2 = new FourFour(110, 90, "Smart", "FourFour", 2015, 13000, 3, true,  90);

        FourFour fourfourused = new FourFour(110, 110, "Smart", "FourFour", 2014, 11000, 3, false,  90);
        FourFour fourfourused1 = new FourFour(110, 100, "Smart", "FourFour", 2014, 11000, 3, false,  90);

        /**
         * Create fourtwo object
         */

        FourTwo fourtwo=new FourTwo(100,70,"Smart","FourTwo",2016,23000,1,true,90);
        FourTwo fourtwo1=new FourTwo(100,80,"Smart","FourTwo",2016,24000,2,true,90);
        FourTwo fourtwo2=new FourTwo(100,90,"Smart","FourTwo",2016,25000,3,true,90);


        FourTwo fourtwoused=new FourTwo(100,100,"Smart","FourTwo",2015,15000,3,false,90);
        FourTwo fourtwoused1=new FourTwo(100,90,"Smart","FourTwo",2015,15000,3,false,90);

        /**
         * Add cars in arrayList , usedCars and newCars
         */
        dealership.addCar(i3);
        dealership.addCar(i32);
        dealership.addCar(i33);
        dealership.addCar(i34);
        dealership.addCar(i35);
        dealership.addCar(i3used);
        dealership.addCar(i3used1);

        dealership.addCar(egolf);
        dealership.addCar(egolf1);
        dealership.addCar(egolf2);
        dealership.addCar(egolf3);
        dealership.addCar(egolfused);
        dealership.addCar(egolfused1);
        dealership.addCar(egolfused2);

        dealership.addCar(eup);
        dealership.addCar(eup1);
        dealership.addCar(eup2);
        dealership.addCar(eupused);
        dealership.addCar(eupused1);

        dealership.addCar(fourfour);
        dealership.addCar(fourfour1);
        dealership.addCar(fourfour2);
        dealership.addCar(fourfourused);
        dealership.addCar(fourfourused1);

        dealership.addCar(fourtwo);
        dealership.addCar(fourtwo1);
        dealership.addCar(fourtwo2);
        dealership.addCar(fourtwoused);
        dealership.addCar(fourtwoused1);

/**
 * Get the stock from dealership
 */
        System.out.println("Stock i3 is: "+dealership.getStockI3());
        System.out.println("Stock eUP is: "+dealership.getStockeUP());
        System.out.println("Stock eGolf is: "+dealership.getStockeGolf());
        System.out.println("Stock FourFour is: "+dealership.getStockFourFour());
        System.out.println("Stock FourTwo is: "+dealership.getStockFourTwo());

        int count = dealership.getNewCars().size();
        System.out.println("newCar list: " + count);

        int count1 = dealership.getUsedCar().size();
        System.out.println("usedCar list: " + count1);

//        Client client = new Client("Gigi","Becali",10000);
//        client.askForCarsWithFastCharging(dealership);
//        client.buyCar(i3,dealership);


    }

}
