
public class BubbleSort {

    /**
     * /*
     In this class i implement BubleSort algorithm
     -call the method getAchieve to sort SalesGuy acording to achieve

     */


    public void sortRepresentativeAchieves(SalesRepresentative[] reps) {


        SalesRepresentative temp = null;

        for (int i = 0; i < reps.length; i++) {
            for (int j = 1; j < reps.length - i; j++) {

                int repAchieve = reps[j - 1].getAchieve();
                int repAchievePlus = reps[j].getAchieve();
                if (repAchieve < repAchievePlus) {
                    temp = reps[j - 1];
                    reps[j - 1] = reps[j];
                    reps[j] = temp;

                }
            }
        }
    }

}