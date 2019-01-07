package com.cs.test;

public class InheritanceTest {
  
  public static void main(String[] args)
  {
    Class2 c = new Class2();
    c.print();
  }
  
}

class Class1 {
  
  String property = "Class 1";
  
  public static void print()
  {
    System.out.println("Class 1");
    
  }
  
}

class Class2 extends Class1 {
  
  // private String property = "Class 2";
  
  public static void print()
  {
    System.out.println("Class 2");
  }
}
