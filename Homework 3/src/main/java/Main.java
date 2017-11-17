/*
In Main class we have the main method , where i initialized SalesGuy, their quota, nrOfSales and their achieves
-add every saleGuy in array
-print SalesGuy before and after sort
 */

public class Main {
    public static void main(String[] args) {

        SalesRepresentative[] reps; // declaring an array
        BubbleSort bubbleSort = new BubbleSort(); //new object from BubleSortc class

        //Initialized  salesGuy, name, quota, ntOfSales and achieves for every salesGuy
        SalesRepresentative salesGuy1 = new SalesRepresentative("Ionel", 300, 5, 1500);
        SalesRepresentative salesGuy2 = new SalesRepresentative("Gigi", 500, 10, 5000);
        SalesRepresentative salesGuy3 = new SalesRepresentative("Aurel", 550, 8, 4400);
        SalesRepresentative salesGuy4 = new SalesRepresentative("Boyka", 600, 6, 3600);
        SalesRepresentative salesGuy5 = new SalesRepresentative("Batman", 350, 12, 4200);

        //add every salesGuy in array
        reps = new SalesRepresentative[]{salesGuy1, salesGuy2, salesGuy3, salesGuy4, salesGuy5};

        System.out.println("");
        System.out.println("Sales representatives before sort");
        System.out.println("");

        //print representatives before sort
        for (SalesRepresentative rep : reps) {
            System.out.println(rep.toString());
        }

        System.out.println("");
        System.out.println("Sales representatives after sort");
        System.out.println("");
        System.out.println("");


        //call method sortRepreentativeAchieves using bubleSort object
        bubbleSort.sortRepresentativeAchieves(reps);

        //print SalesRepresentative after sort
        for (SalesRepresentative rep : reps) {
            System.out.println(rep.toString());
        }


    }
}
