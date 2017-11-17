package ro.sci.service;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchCauciucRequest;


public class RequestCauciucService {
    private CauciucService cauciucService = new CauciucService();

    public Cauciuc search(SearchCauciucRequest searchCauciucRequest) {
        Cauciuc validCauciuc = null;
        if (searchCauciucRequest != null) {
            Cauciuc cauciuc = this.cauciucService.findCauciuc(searchCauciucRequest.producer);
            validCauciuc = cauciuc;
        }
        return validCauciuc;
    }
}


