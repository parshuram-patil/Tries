package com.cs.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
  
  public static void main(String[] args)
  {
    Map<String, String> map = new TreeMap<>();
    //Map<String, String> map = new HashMap<>();
    //Map<String, String> map = new LinkedHashMap<>();
    map.put("a", "a");
    map.put("1", "1");
    map.put("3", "3");
    map.put("2", "2");
    
    Set<Entry<String, String>> entrySet = map.entrySet();
    for(Entry<String, String> entry : entrySet) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
    
    System.out.println("*********************************");
    
    Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
    while(iterator.hasNext()) {
      Entry<String, String> next = iterator.next();
      System.out.println(next.getKey() + " : " + next.getValue());
    }
  }
}
