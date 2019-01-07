package com.cs.inheritance;

public class MainClass {
  
  public static void main(String[] args)
  {
    ParentClass p = new ChaildClass1();
    p.parentMethod1();
    p.setParentProperty("XXX");
    System.out.println(p.getParentProperty());
    ParentClass p1 = null;
    p1.parentMethod2();
    //p1.setParentProperty("ss");
  }
  
}
