package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type; // For handling generic types like List<String>

public class GsonUtils {

    private static final Gson GSON_INSTANCE = new GsonBuilder()
            .setPrettyPrinting() // Optional: for human-readable JSON output
            // .setDateFormat("yyyy-MM-dd HH:mm:ss") // Optional: customize date format
            .create();

    /**
     * Serializes a Java object to a JSON string.
     *
     * @param object The object to serialize.
     * @return The JSON string representation of the object.
     */
    public static String toJson(Object object) {
        return GSON_INSTANCE.toJson(object);
    }

    /**
     * Deserializes a JSON string into a Java object of the specified class.
     *
     * @param json The JSON string to deserialize.
     * @param classOfT The class of the object to deserialize into.
     * @param <T> The type of the object.
     * @return The deserialized Java object.
     */
    public static <T> T fromJson(String json, Class<T> classOfT) {
        return GSON_INSTANCE.fromJson(json, classOfT);
    }

    /**
     * Deserializes a JSON string into a Java object of a generic type (e.g., List<String>).
     * Use this for parameterized types where `Class<T>` alone is insufficient.
     *
     * @param json The JSON string to deserialize.
     * @param typeOfT The `Type` representing the generic type (e.g., `new TypeToken<List<String>>(){}.getType()`).
     * @param <T> The type of the object.
     * @return The deserialized Java object.
     */
    public static <T> T fromJson(String json, Type typeOfT) {
        return GSON_INSTANCE.fromJson(json, typeOfT);
    }

    // Add more utility methods as needed, e.g., to write/read from files,
    // or to handle specific serialization/deserialization scenarios.
}
