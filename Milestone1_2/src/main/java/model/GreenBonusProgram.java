package model;

import java.util.ArrayList;

public class GreenBonusProgram {
    private int fixBudget;
    private ArrayList<Car>historyOfSales;

    public GreenBonusProgram(int fixBudget, ArrayList<Car> historyOfSales) {
        this.fixBudget = fixBudget;
        this.historyOfSales = historyOfSales;
    }
}
