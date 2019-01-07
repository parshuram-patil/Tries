package com.cs.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
  
  public static void main(String[] args)
  {
    //Set<String> set = new HashSet<>();
    //Set<String> set = new LinkedHashSet<>();
    Set<String> set = new TreeSet<>();
    set.add("a");
    set.add("1");
    set.add("3");
    set.add("2");
    set.add("b");
    
    for(String e : set) {
      System.out.println(e);
    }
  }
}
