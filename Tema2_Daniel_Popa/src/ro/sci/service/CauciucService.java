package ro.sci.service;

import ro.sci.domain.Cauciuc;

public class CauciucService {
    private Cauciuc[] cauciuce;

    public CauciucService() {
        initCauciuce();

    }

    public Cauciuc findCauciuc(String producer) {
        Cauciuc foundCauciuc = null;
        for (Cauciuc cauciuc : cauciuce) {
            if (producer != null && producer.equals(cauciuc.producer)) {
                foundCauciuc = cauciuc;
                break;
            }
        }
        return foundCauciuc;

    }

    private void initCauciuce() {
        Cauciuc c1 = new Cauciuc("Goodyear");
        c1.type="summer";
        Cauciuc c2 = new Cauciuc ("Continental");
        c2.type = "all seasons"+ "4x4 Summer";
        Cauciuc c3 = new Cauciuc("Mitas");
        c3.type="4x4 winter"+"all terrain";
        Cauciuc c4 = new Cauciuc ("Viking");
        c4.type="Carco summer"+"Cargo winter"+"Cargo all seasons";
        cauciuce = new Cauciuc[]{c1, c2, c3, c4};
    }
}
