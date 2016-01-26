package com.open.erp.storage;

import org.mongodb.morphia.Datastore;

/**
 * Created by thofl on 1/25/2016.
 */
public interface Database  {
    Datastore getInstance();
}
