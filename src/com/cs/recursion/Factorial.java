package com.cs.recursion;


public class Factorial {
  
  public static void main(String[] args)
  {
    System.out.println(getFactorial(3));
  }

  private static Integer getFactorial(int num)
  {
    if(num == 1 || num == 0) {
      return 1;
    }
    
    return num * getFactorial(num - 1);
  }
  
}
