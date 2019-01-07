package com.cs.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionLmada {
  
  public static void main(String args[])
  {
    Map<String, Object> map1 = new HashMap<>();
    map1.put("1", "1-Value");
    map1.put("2", "2-Value");
    Map<String, Object> map2 = new HashMap<>();
    //map2 = map1;
    //map2.putAll(map1);
   /* for(Object value : map1.values()) {
      System.out.println(value);
    }*/
    
    printMap(map2);
    List<String> as = new ArrayList<>();
    
    as.forEach(x -> {
      print(map2);
    });
  }

  private static void printMap(Map<String, Object> map2)
  {
    
  }

  private static void print(Map<String, Object> map2)
  {
    System.out.println(map2);
  }
}
