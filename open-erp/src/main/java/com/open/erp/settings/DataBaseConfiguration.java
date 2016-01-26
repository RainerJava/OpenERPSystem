package com.open.erp.settings;


/**
 * Created by thofl on 1/25/2016.
 */
public class DataBaseConfiguration implements Configuration {

    public String GetConnection() {
        //For now this is where we would put the url for our local mongo instances.
        return "localhost";
    }

    public String GetDatabaseName(){
        return "OpenErpSystem";
    }
}
