package com.learning.productservices.java.Advance.Stream.StreamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OfNullable {
    public static void main(String[] args) {
        // stream.ofNullable

        List<String> names = Arrays.asList("Somphong", null, "Somchai", null, "Somsri");
//        List<String> nonNullNames = names.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
//        System.out.println(nonNullNames);java


        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 2)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }
}
