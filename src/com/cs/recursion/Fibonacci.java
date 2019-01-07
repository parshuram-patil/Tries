package com.cs.recursion;

public class Fibonacci {
  
  public static void main(String[] args)
  {
    //System.out.println(printFibonacciSeries(10) > 0 ? "" : null);
  }
  
  /*private static Integer printFibonacciSeries(int num)
  {
    int a = 0, b = 0, c = 1;
    for (int i = 1; i <= num; i++) {
      a = b;
      b = c;
      c = a + b;
      System.out.print(a + " ");
    }
    System.out.println();
    
    //return printFibonacciSeries(0, 1, num);
    return printFibonacciSeries(num, 0);
  }*/
  
  /*private static Integer printFibonacciSeries(int first, int second, int lenth)
  {
    System.out.print(first + " ");
    if (lenth == 1) {
      
      return first + second;
    }
    
    
    return printFibonacciSeries(second, first + second, --lenth);
  }*/
  
  /*private static Integer printFibonacciSeries(int num)
  {
    //System.out.println("Method " + num);
    if (num <= 1) {
      //System.out.println("Returned " + num);
      return num;
    }
    
    Integer printFibonacciSeries = printFibonacciSeries(num - 1);
    Integer printFibonacciSeries2 = printFibonacciSeries(num - 2);
    return printFibonacciSeries + printFibonacciSeries2;
  }*/ 
  
  /*private static Integer printFibonacciSeries(int num)
  {
    int fibonacci = fibo1 + fibo2; fibo1 = fibo2; fibo2 = fibonacci;

    Read more: http://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html#ixzz5Q1PKYieB
  }*/
}
