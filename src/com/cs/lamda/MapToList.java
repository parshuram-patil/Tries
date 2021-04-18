package com.cs.lamda;

import java.util.*;

import static java.util.stream.Collectors.*;

public class MapToList {

    private static void groupAnagrams() {
        System.out.println("Grouping Anagrams");

        List<String> inputList = Arrays.asList("car", "lback", "arc", "dog", "acr", "black", "rac", "ablck","god", "ackbl");
        Map<String, List<String>> groupByActualStrings  = inputList.stream()
                .collect(groupingBy(
                        e -> {
                            char[] content = e.toCharArray();
                            Arrays.sort(content);
                            return new String(content);
                        },
                        mapping(e -> e, toList())
                        )
                );
        List<String> outputList = groupByActualStrings.values().stream()
                .flatMap(List::stream)
                .collect(toList());
        System.out.println(outputList);

    }

    public static void main(String[] args) {
        groupAnagrams();
    }
}
