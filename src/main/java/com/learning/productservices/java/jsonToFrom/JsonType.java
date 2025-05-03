package com.learning.productservices.java.jsonToFrom;

import com.google.gson.*;

public class JsonType {
    public static void main(String[] args) {

        // สมมติว่า jsonContext เป็น JsonReader หรืออื่น ๆ
        // ตัวอย่างนี้ให้ใช้ JsonParser แปลง JSON จาก String เป็น JsonElement
//        String jsonString = "$.name.John.age";
        String jsonString = "itemList[*].orderList.orderId";
        JsonElement je = JsonParser.parseString(jsonString).getAsJsonArray();

        // ตรวจสอบประเภทของ JsonElement
        if (je.isJsonObject()) {

            System.out.println("It's a JsonObject");
            JsonObject jsonObject = je.getAsJsonObject();
            System.out.println("Name: " + jsonObject.get("name").getAsString());
            System.out.println("Age: " + jsonObject.get("age").getAsInt());
            System.out.println("City: " + jsonObject.get("city").getAsString());

        } else if (je.isJsonArray()) {

            System.out.println("It's a JsonArray");
            JsonArray jsonArray = je.getAsJsonArray();
            // ทำสิ่งที่ต้องการกับ JsonArray

        } else if (je.isJsonPrimitive()) {

            System.out.println("It's a JsonPrimitive");
            // ทำสิ่งที่ต้องการกับ JsonPrimitive

        } else if (je.isJsonNull()) {

            System.out.println("It's a JsonNull");
            // ทำสิ่งที่ต้องการกับ JsonNull

        }
    }
}
