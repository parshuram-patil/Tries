package com.cs.inheritance;

public abstract class ParentClass {
  
  ParentClass(String s) {
    System.out.println(this.getClass().getSimpleName() + " : Parent Constructor");
  }
  
  private String parentProperty;
  
  public String getParentProperty()
  {
    return parentProperty;
  }
  
  public void setParentProperty(String parentProperty)
  {
    this.parentProperty = parentProperty;
  }

  public  void parentMethod1()
  {
    System.out.println(this.getClass().getSimpleName()); 
  }
  
  public static void parentMethod2()
  {
    System.out.println(/*this.getClass().getSimpleName()*/); 
  }
}
