package com.iteration.model;

import java.sql.Timestamp;

public class BaseModel {

    private Timestamp lastUpdate;

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
