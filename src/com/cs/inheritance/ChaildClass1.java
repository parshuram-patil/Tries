package com.cs.inheritance;


public class ChaildClass1 extends ParentClass {
  
  ChaildClass1() {
    super("asd");
    System.out.println(this.getClass().getSimpleName() + " : Constructor");
  }
  
  public void parentMethod1()
  {
    System.out.println(this.getClass().getSimpleName() + " : parentMethod1()"); 
  }
  
  public static void parentMethod2()
  {
    System.out.println(/*this.getClass().getSimpleName() + " : parentMethod2()"*/); 
  }
}
