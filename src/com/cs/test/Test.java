package com.cs.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {
  
  public static void main(String[] args) throws InterruptedException
  {
    /*System.out.println("*** " + args[0] + " ***");
    Integer num = 1233456;//args[0];
    String strNum = String.valueOf(num);
    for(int len = strNum.length()-1; len >= 0; len-- ) {
      System.out.print(strNum.charAt(len));
    }*/
    List<String> list = new ArrayList<String>();
    // add some stuff
    list.add("android");
    list.add("apple");
    
    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()) {
      System.out.println(" >>> " + iterator.next());
    }
    
    while(iterator.hasNext()) {
      System.out.println(" <<< " + iterator.next());
    }

    /*String[] stringArray = list.toArray(new String[0]);
    System.out.println(" ---> " + stringArray[0]);
    
    Map<Integer, String> map = new HashMap<>();
    for (Integer i = 1; i <= 10; i++) {
      map.put(i, i.toString());
    }
    
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + "->" + entry.getValue());
    }
    
    // using keySet() for iteration over keys
    for (Integer key : map.keySet())
      System.out.println("key: " + key);
    
    // using values() for iteration over keys
    for (String value : map.values())
      System.out.println("value: " + value);
    Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
    while(itr.hasNext()) {
      System.out.println(itr.next().getKey());
      itr.remove();
    }
    System.out.println(map.toString());*/
  }
}
