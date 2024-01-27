package com.k8sjourney.travelapi.controller;

import com.k8sjourney.travelapi.model.TravelItinerary;
import com.k8sjourney.travelapi.service.TravelItineraryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelController {
    @Autowired
    private TravelItineraryService travelItineraryService;

    @GetMapping
    public List<TravelItinerary> getAllItineraries() {
        return travelItineraryService.getAllTravelItineraries();
    }

    @PostMapping
    public TravelItinerary createItinerary(@RequestBody TravelItinerary itinerary) {
        System.out.println(itinerary.toString());
        return travelItineraryService.saveTravelItinerary(itinerary);
    }

}
