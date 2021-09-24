package com.cs.patterns.abstrct.factory;

import com.cs.patterns.factory.Computer;

public class ComputerFactory {
  
  public static Computer getComputer(ComputerAbstractFactory factory)
  {
    return factory.createComputer();
  }
}
