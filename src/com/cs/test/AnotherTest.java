package com.cs.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnotherTest {
  
  public static void main(String[] args) throws InterruptedException
  {
    types(1, "123", "122");
    //types(1, new ArrayList<>(Arrays.asList("123")));
  }
  
  public static void types(Integer integer, String... types)
  {
    System.out.println(types.getClass().getSimpleName() + " ---> " + types.toString());
  }
  
  public static void types(Integer integer, List<String>... types)
  {
    System.out.println(types.getClass().getSimpleName() + " ---> " + types.toString());
  }
}
