package com.cs.design.patterns.factory;

import com.cs.design.patterns.factory.ComputerFactory.COMPUTER_TYPE;

public class TestFactory {
  
  public static void main(String[] args)
  {
    Computer pc = ComputerFactory.getComputer(COMPUTER_TYPE.PC, "2 GB", "500 GB", "2.4 GHz");
    Computer server = ComputerFactory.getComputer(COMPUTER_TYPE.SERVER, "16 GB", "1 TB", "2.9 GHz");
    System.out.println("Factory PC Config -> " + pc);
    System.out.println("Factory Server Config -> " + server);
  }
}