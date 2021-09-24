package com.cs.patterns.builder;

public class BuilderPatternTest {
  
  public static void main(String[] args)
  {
    // Using builder to get the object in a single line of code and
    // without any inconsistent state or arguments management issues
    Computer comp = new Computer.Builder("500 GB", "2 GB").setBluetoothEnabled(true).build();
    System.out.println(comp);
  }
}
