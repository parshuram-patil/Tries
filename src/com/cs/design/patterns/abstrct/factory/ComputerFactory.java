package com.cs.design.patterns.abstrct.factory;

import com.cs.design.patterns.factory.Computer;

public class ComputerFactory {
  
  public static Computer getComputer(ComputerAbstractFactory factory)
  {
    return factory.createComputer();
  }
}
