package com.cs.patterns.factory;

public class ComputerFactory {
  
  /*enum COMPUTER_TYPE
  {
    
    PC("PC", "PC"), SERVER("SERVER", "SERVER");
    
    private final String key;
    private final String value;
    
    COMPUTER_TYPE(String key, String value)
    {
      this.key = key;
      this.value = value;
    }
    
    public String getKey()
    {
      return key;
    }
    
    public String getValue()
    {
      return value;
    }
  }*/
  
  enum COMPUTER_TYPE
  {
    PC, SERVER
  }
  
  public static Computer getComputer(COMPUTER_TYPE type, String ram, String hdd, String cpu)
  {
    if (COMPUTER_TYPE.PC.equals(type))
      return new PC(ram, hdd, cpu);
    else if (COMPUTER_TYPE.SERVER.equals(type))
      return new Server(ram, hdd, cpu);
    
    return null;
  }
}
