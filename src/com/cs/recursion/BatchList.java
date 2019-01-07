package com.cs.recursion;

import java.util.ArrayList;
import java.util.List;

public class BatchList {
  
  public static void main(String[] args)
  {
    List<Integer> list = new ArrayList<>();
    for(int i=1; i <= 1896; i++)
      list.add(i);
    
    int listSize = list.size();
    //System.out.println(list);
    
    Integer count = 0, size = 7;
    
    while(count <= listSize) {
      int toSize = count+size;
      toSize =  toSize < listSize ? toSize : listSize;
      List<Integer> subList = list.subList(count, toSize);
      System.out.println(subList);
      count += size;
    }
  }
  
}
