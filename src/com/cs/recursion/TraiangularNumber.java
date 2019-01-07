package com.cs.recursion;

public class TraiangularNumber {
  
  public static void main(String[] args)
  {
    
    Integer tn = getTriangularNumber(6);
    System.out.println("TN : " + tn);
  }
  
  private static Integer getTriangularNumber(int num)
  {
    System.out.println("Method " + num);
    if (num == 1) {
      System.out.println("Returned 1");
      return 1;
    }
    
    Integer result = num + getTriangularNumber(num - 1);
    System.out.print("Returned " + result);
    System.out.println(" : " + num + " + getTriangularNumber(" + num + "- 1)");
    return result;
  }
  
}
