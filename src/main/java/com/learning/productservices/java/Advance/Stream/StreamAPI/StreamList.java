package com.learning.productservices.java.Advance.Stream.StreamAPI;

import lombok.var;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

//        strings = List.of("one","two","three","four");

        var map = strings.stream().collect(groupingBy(String::length, counting()));
        map.forEach((key, value) -> System.out.println(key + " :: " + value));

        // stream from array
        String[] array = new String[]{"a", "b", "c", "d", "e"};
        Stream<String> streamOfArray = Arrays.stream(array);
        System.out.println("streamOfArray" + streamOfArray);

        //stream from collection
        List<String> collection = Arrays.asList(array);
        Stream<String> streamOfCollection = collection.stream();
        System.out.println("streamOfCollection" + streamOfCollection);

        //user stream's 'of' method
        Stream<String> stream = Stream.of("a", "b", "c", "d", "e");


    }
}
