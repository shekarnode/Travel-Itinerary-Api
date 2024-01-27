package com.k8sjourney.travelapi.repository;

import com.couchbase.client.java.query.QueryScanConsistency;
import com.k8sjourney.travelapi.model.TravelItinerary;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.ScanConsistency;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("travelItineraryRepository")
@ScanConsistency(query = QueryScanConsistency.REQUEST_PLUS)
public interface TravelItineraryRepository extends CouchbaseRepository<TravelItinerary, String> {


}
