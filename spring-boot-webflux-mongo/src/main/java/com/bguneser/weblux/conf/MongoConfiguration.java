package com.bguneser.weblux.conf;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories("com.bguneser.weblux")
public class MongoConfiguration extends AbstractReactiveMongoConfiguration {

    @Override
    public MongoClient reactiveMongoClient() {

        return MongoClients.create();
    }

    // @Value annotation ile okunupta buraya getirilebilinir
    @Override
    protected String getDatabaseName() {

        return "mydb";
    }
}
