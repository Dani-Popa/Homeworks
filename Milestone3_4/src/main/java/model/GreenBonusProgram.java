package model;

import java.util.ArrayList;

public class GreenBonusProgram {
    private int fixBudget = 10000;
    private ArrayList<Car> historyOfSales;
    private int budget = 10000000;

    public int getFixBudget() {
        try {
            if (budget <= fixBudget) throw new BudgetIsOutException();
            {
                budget -= fixBudget;
                return fixBudget;
            }

        } catch (BudgetIsOutException e) {
            System.out.println("Budget is out!!! ");
        }
        return 0;
    }

}
