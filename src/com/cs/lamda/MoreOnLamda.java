package com.cs.lamda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoreOnLamda {
  
  public static void main(String[] args)
  {
    List<Integer> intList = Arrays.asList(0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9);
    
    intList.stream()
    //.forEach(System.out::print);
    //.forEach(MoreOnLamda::print);
    //.filter(n -> n % 2 == 0)
    //.forEach(n -> print(n));
    .map(e -> e.toString())
    .collect(Collectors.toSet());
    
    Map<String, String> map = new HashMap<>();
    map.put("1", "1");
    map.put("2", "2");
    map.put("3", "3");
    map.put("4", "4");
    
    //map.forEach((key, value) -> map.put(key, value + "_value"));
    
    
    System.out.println(map.toString());
    
  }
  
  private static void print(Object obj)
  {
    System.out.print(obj + "\t");
  }
  
}
