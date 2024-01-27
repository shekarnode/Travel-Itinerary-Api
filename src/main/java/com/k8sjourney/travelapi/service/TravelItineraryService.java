package com.k8sjourney.travelapi.service;

import com.k8sjourney.travelapi.model.TravelItinerary;


import com.k8sjourney.travelapi.repository.TravelItineraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelItineraryService {

    @Autowired
    private TravelItineraryRepository travelItineraryRepository;

    public List<TravelItinerary> getAllTravelItineraries() {
        return travelItineraryRepository.findAll();
    }

    public TravelItinerary saveTravelItinerary(TravelItinerary itinerary) {
        return travelItineraryRepository.save(itinerary);
    }
}
