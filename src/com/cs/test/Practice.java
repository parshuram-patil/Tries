package com.cs.test;


public class Practice extends Parent implements Interface1, Interface2 {
  
  public static void main(String[] args)
  {
    Practice practice = new Practice();
    practice.printProp();
    practice.log("Logging Done");
    Interface1.isNull("null");
    Interface2.isNull("null");
    
  }

  @Override
  public void method1(String str)
  {
    // TODO Auto-generated method stub
    
  }
  
  public void printProp()
  {
    System.out.println(Status.ACTIVE.getKey() + ":" + Status.ACTIVE.getValue());
  }
  
}

class Parent {
  
  String prop = "String Property";
  
  public String getProp()
  {
    return prop;
  }

  
  public void setProp(String prop)
  {
    this.prop = prop;
  }
  
  public void printProp()
  {
    System.out.println(this.prop);
  }
  
}

interface Interface1 {

  void method1(String str);
  
  default void log(String str){
    System.out.println("I1 logging::"+str);
  }
  
  static boolean isNull(String str) {
    System.out.println("Interface1 Null Check");

    return str == null ? true : "".equals(str) ? true : false;
  }
}

interface Interface2 {

  void method1(String str);
  
  /*default void log(String str){
    System.out.println("I2 logging::"+str);
  }*/
  
  static boolean isNull(String str) {
    System.out.println("Interface2 Null Check");

    return str == null ? true : "".equals(str) ? true : false;
  }

}

enum Status {

  ACTIVE("Active", 1), IN_ACTIVE("In Active", 0);

  private final String key;
  private final Integer value;

  Status(String key, Integer value) {
      this.key = key;
      this.value = value;
  }

  public String getKey() {
      return key;
  }
  public Integer getValue() {
      return value;
  }
}
