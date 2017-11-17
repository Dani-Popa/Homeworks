package ro.sci.domain;

public class SearchCauciucRequest {
    public String producer;
    public String type;


    public SearchCauciucRequest(String producer, String type) {
        this.producer = producer;
        this.type = type;
    }
}