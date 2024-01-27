package com.k8sjourney.travelapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {CouchbaseAutoConfiguration.class})
public class TravelapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelapiApplication.class, args);
	}

}
