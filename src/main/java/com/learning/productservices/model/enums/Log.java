package com.learning.productservices.model.enums;

import lombok.Getter;

@Getter
public enum Log {

    APP_NAME("app.name"),
    APP_PURPOSE("app.purpose"),
    APP_FE_PORT("app.frontend.port"),
    APP_BE_PORT("app.backend.port"),
    APP_DB_NAME("app.database.name");

    private final String value;

    Log(String value) {
        this.value = value;
    }
}
