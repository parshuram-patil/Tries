package com.cs.interfce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class1 implements Interface1, Interface2 {
  
  final String finalString;
  
  Class1()
  {
    finalString = "111";
  }
  
  @Override
  public void method1()
  {
    System.out.println(it2Prop + finalString);
  }
  
  @Override
  public void method1(String ss)
  {
    // TODO Auto-generated method stub
    List<String> list = new ArrayList<>();
    Map<String, Object> map = new HashMap<>();
  }
  
}
