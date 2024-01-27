package com.k8sjourney.travelapi.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@NoArgsConstructor
@Getter
@Setter
public class TravelItinerary {

    @Id
    private String id;
    private String destination;
    private String startDate;
    private String endDate;

    @Override
    public String toString() {
        return "TravelItinerary{" +
                "id='" + id + '\'' +
                ", destination='" + destination + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
