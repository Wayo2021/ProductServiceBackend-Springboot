package utils;

import com.google.gson.reflect.TypeToken; // For generic type handling

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class GsonMainTest {
    public static void main(String[] args) {
        // Serialization
        MyObject obj = new MyObject("Test Name", 30);
        String jsonOutput = GsonUtils.toJson(obj);
        System.out.println("Serialized object: " + jsonOutput);

        // Deserialization
        MyObject deserializedObj = GsonUtils.fromJson(jsonOutput, MyObject.class);
        System.out.println("Deserialized object name: " + deserializedObj.getName() + deserializedObj.getAge());

        // Handling generic types (e.g., List)
        List<String> stringList = Arrays.asList("apple", "banana", "cherry");
        String listJson = GsonUtils.toJson(stringList);
        System.out.println("Serialized list: " + listJson);

        Type listType = new TypeToken<List<String>>() {}.getType();
        List<String> deserializedList = GsonUtils.fromJson(listJson, listType);
        System.out.println("Deserialized list: " + deserializedList);
    }
}

class MyObject {
    private String name;
    private int age;

    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}