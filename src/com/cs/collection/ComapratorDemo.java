package com.cs.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ComapratorDemo {
  
  public static void main(String args[]) throws Exception
  {
    Map<String, Object> map;
    
    // map = new TreeMap<>();
    // map = new LinkedHashMap<>();
    map = new HashMap<>();
    
    map.put("-1", "1");
    map.put("2", "1");
    map.put("B", "1");
    map.put("A", "1");
    map.put("1", "1");
    map.put("3", "1");
    
    // System.out.println(map.toString());
    
    Map<String, Object> ascMap = new TreeMap<>(map);
    System.out.println(ascMap.toString());
    
    Map<String, Object> dscMap = new TreeMap<>(new Comparator<String>()
    {
      
      @Override
      public int compare(String o1, String o2)
      {
        System.out.println(o1 + "-->" + o2);
        return o1.compareTo(o2);
      }
    });
    dscMap.putAll(map);
    System.out.println(dscMap.toString());
  }
}
