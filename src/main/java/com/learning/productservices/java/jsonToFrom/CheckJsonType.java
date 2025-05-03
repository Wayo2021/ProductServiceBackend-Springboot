package com.learning.productservices.java.jsonToFrom;

import com.google.gson.*;

public class CheckJsonType {
    public static void main(String[] args) {

        String jsonString = "itemList[*].orderList.orderId";
        JsonElement je = JsonParser.parseString(jsonString).getAsJsonArray();

        if (je instanceof JsonArray) {
            System.out.println("It's a JsonArray");
        } else if (je instanceof JsonPrimitive) {
            System.out.println("It's a JsonPrimitive");
        } else if (je instanceof JsonObject) {
            System.out.println("It's a JsonObject");
        } else if (je instanceof JsonNull) {
            System.out.println("It's a JsonNull");
        }
    }
}
