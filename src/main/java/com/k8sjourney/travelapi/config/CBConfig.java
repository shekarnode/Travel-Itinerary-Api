package com.k8sjourney.travelapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories

public class CBConfig extends AbstractCouchbaseConfiguration {

    @Override
    protected boolean autoIndexCreation() {
        return true;
    }

    @Value("${couchbase.hosts}")
    String connectionString;

    @Value("${couchbase.username}")
    String username;

    @Value("${couchbase.bucket.password}")
    String password;

    @Value("${couchbase.bucket.name}")
    String bucketname;


    @Override
    public String getConnectionString() {
        return this.connectionString;
    }

    @Override
    public String getUserName() {

        return this.username;
    }

    @Override
    public String getPassword() {
        return  this.password;
    }

    @Override
    public String getBucketName() {
        return this.bucketname;
    }


}
