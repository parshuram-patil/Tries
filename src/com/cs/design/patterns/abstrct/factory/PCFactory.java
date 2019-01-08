package com.cs.design.patterns.abstrct.factory;

import com.cs.design.patterns.factory.Computer;
import com.cs.design.patterns.factory.PC;

public class PCFactory implements ComputerAbstractFactory {
  
  private String ram;
  private String hdd;
  private String cpu;
  
  public PCFactory(String ram, String hdd, String cpu)
  {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
  }
  
  @Override
  public Computer createComputer()
  {
    return new PC(ram, hdd, cpu);
  }
}
