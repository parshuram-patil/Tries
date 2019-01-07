package com.cs.lamda;

public class LamdaTest {
  
  public static void main(String[] args)
  {
    Integer a = 10;
    FunctionalInterface fI = execute(a);
    System.out.println(fI.operation(5, 5));
    
    FunctionalInterfaceMessage fM = execute(a, 5);
    //System.out.println(fM.operation("Addition"));

  }
  
  
  private static void log(String msg) {
    System.out.println("\t ---> " + msg);
  }
  
  private static FunctionalInterface execute(Integer a)
  {
    return (Integer x, Integer y) -> {
      return a + x + y;
    };
  }
  
  private static FunctionalInterfaceMessage execute(Integer x, Integer y)
  {
    return (msg) -> {
     System.out.println(msg + " ---> " + x + "+" + y + " =" + x+y);
     return null;
      //return x + y;
    };
  }
}

interface FunctionalInterface {
  
  Integer operation(Integer one, Integer two);
}

interface FunctionalInterfaceMessage {
  
  Integer operation(String msg);
}
