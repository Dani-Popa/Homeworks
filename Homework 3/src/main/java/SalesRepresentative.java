

public class SalesRepresentative {

    /**
     * /*
     In this class I impelmented the variable that i need for SaleGuy
     -override toString() method

     */
     */
    //variable that i need for salesGuy
    private int quota;
    private int nrOfSales;
    private int achieve;
    private String name;

    //This is a constructor for SalesRepresentative class
    public SalesRepresentative(String name, int quota, int nrOfSales, int achieve) {
        this.name = name;
        this.quota = quota;
        this.nrOfSales = nrOfSales;
        this.achieve = achieve;
    }

    //getAchieve() method
    public int getAchieve() {
        return achieve;
    }


    //Overriding toString() method
    @Override
    public String toString() {
        return name + " " + quota + " " + nrOfSales + " " + achieve;
    }


}

