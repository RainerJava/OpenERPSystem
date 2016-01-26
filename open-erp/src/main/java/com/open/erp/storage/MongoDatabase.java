package com.open.erp.storage;
import com.mongodb.MongoClient;
import com.open.erp.settings.Configuration;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import javax.inject.Inject;


/**
 * Created by thofl on 1/25/2016.
 */
public class MongoDatabase implements Database {

    private final Configuration configuration;
    private final Morphia morphia;
    @Inject
    public MongoDatabase(Configuration configuration){
        this.configuration = configuration;
        morphia = new Morphia();
        morphia.mapPackage("com.open.erp");
    }

    public Datastore getInstance(){
        MongoClient mongoClient = new MongoClient(configuration.GetConnection());
        return morphia.createDatastore(mongoClient, configuration.GetDatabaseName());
    }

}
