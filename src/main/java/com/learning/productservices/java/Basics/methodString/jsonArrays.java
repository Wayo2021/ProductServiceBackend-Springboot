package com.learning.productservices.java.Basics.methodString;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;

public class jsonArrays {
    public static void main(String[] args) {

        HashMap<String, JsonElement> requestParam = new HashMap<>();

        JsonArray arrayHeadService = new JsonArray();

        JsonObject objectFirstSizeAttributeService = new JsonObject();
        JsonObject objectSecondSizeAttributeService = new JsonObject();

        JsonArray arrayFirstSizeAttribute = new JsonArray();
        JsonArray arraySecondSizeAttribute = new JsonArray();

        objectFirstSizeAttributeService.addProperty("serviceCode", "P150xxx");
        objectFirstSizeAttributeService.addProperty("actionCd", "Add");

        addFieldToJsonArray(arrayFirstSizeAttribute, "installedFlag","N");
        addFieldToJsonArray(arraySecondSizeAttribute, "installedFlag","N");

        if (!ObjectUtils.isEmpty(objectFirstSizeAttributeService)) {
            objectFirstSizeAttributeService.add("arrayFirstSizeAttributeList", arrayFirstSizeAttribute);
            arrayHeadService.add(objectFirstSizeAttributeService);
            requestParam.put("arrayPlayBoxExtAttributeList_1", arrayHeadService);
        }

        if (!ObjectUtils.isEmpty(objectSecondSizeAttributeService)) {
            objectSecondSizeAttributeService.add("arraySecondSizeAttributeList", arraySecondSizeAttribute);
            arrayHeadService.add(objectSecondSizeAttributeService);
            requestParam.put("arrayPlayBoxExtAttributeList_1", arrayHeadService);
        }

    }

    private static void addFieldToJsonArray(JsonArray jsonArray, String name, String value) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("value", value);
        jsonArray.add(jsonObject);
    }
}
