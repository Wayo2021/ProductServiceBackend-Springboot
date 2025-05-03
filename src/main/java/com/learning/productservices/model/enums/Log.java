package com.learning.productservices.model.enums;

import lombok.Getter;

@Getter
public enum Log {

    APP_NAME("app.name"),
    APP_PURPOSE("app.purpose"),
    APP_DB_PORT("app.db.port"),
    APP_DB_NAME("app.db.name");

    private final String value;

    Log(String value) {
        this.value = value;
    }
}
