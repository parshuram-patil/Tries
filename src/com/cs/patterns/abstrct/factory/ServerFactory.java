package com.cs.patterns.abstrct.factory;

import com.cs.patterns.factory.Computer;
import com.cs.patterns.factory.Server;

public class ServerFactory implements ComputerAbstractFactory {
  
  private String ram;
  private String hdd;
  private String cpu;
  
  public ServerFactory(String ram, String hdd, String cpu)
  {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
  }
  
  @Override
  public Computer createComputer()
  {
    return new Server(ram, hdd, cpu);
  }
}
