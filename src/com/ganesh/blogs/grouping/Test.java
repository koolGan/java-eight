package com.ganesh.blogs.grouping;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static Map<String, Long> occurrenceCount(String[] values) {
        return Arrays.asList(values).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }


    public static void main(String[] args) {
        String[] values = {"a", "b", "c", "d", "s", "a", "b", "b", "s"};
            occurrenceCount(values).forEach((x,y)-> System.out.println(x+" "+y));
    }
}
