package ro.sci.controller;


import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchCauciucRequest;
import ro.sci.service.RequestCauciucService;

public class CauciucController  {
    public RequestCauciucService searchCauciucService = new RequestCauciucService();

    public Cauciuc handleSearchCauciucRequest(SearchCauciucRequest SearchCauciucRequest) {
        Cauciuc cauciuc = this.searchCauciucService.search(SearchCauciucRequest);
        return cauciuc;

    }

}


