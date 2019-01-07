package com.cs.test;


public class Random {
  
  public static void main(String[] args)
  {
    for(int i=1; i<=10; i++) {
      Integer rand = (int) ((Math.random() * ((1 - 1) + 1)) + 1);
      System.out.println(rand);
    }
  }
  
}
