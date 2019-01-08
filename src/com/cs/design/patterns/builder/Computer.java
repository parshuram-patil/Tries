package com.cs.design.patterns.builder;

public class Computer {
  
  // required parameters
  private String  HDD;
  private String  RAM;
  
  // optional parameters
  private boolean isGraphicsCardEnabled;
  private boolean isBluetoothEnabled;
  
  public String getHDD()
  {
    return HDD;
  }
  
  public String getRAM()
  {
    return RAM;
  }
  
  public boolean isGraphicsCardEnabled()
  {
    return isGraphicsCardEnabled;
  }
  
  public boolean isBluetoothEnabled()
  {
    return isBluetoothEnabled;
  }
  
  private Computer()
  {
  }
  
  // Builder Class
  public static class Builder {
    
    // required parameters
    private String  HDD;
    private String  RAM;
    
    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    
    public Builder(String hdd, String ram)
    {
      this.HDD = hdd;
      this.RAM = ram;
    }
    
    public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled)
    {
      this.isGraphicsCardEnabled = isGraphicsCardEnabled;
      return this;
    }
    
    public Builder setBluetoothEnabled(boolean isBluetoothEnabled)
    {
      this.isBluetoothEnabled = isBluetoothEnabled;
      return this;
    }
    
    public Computer build()
    {
      Computer computer = new Computer();
      computer.HDD =  HDD;
      computer.RAM =  RAM;
      computer.isGraphicsCardEnabled =  isGraphicsCardEnabled;
      computer.isBluetoothEnabled =  isBluetoothEnabled;
      
      return computer;
    }
    
  }
  
  @Override
  public String toString()
  {
    return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", Graphics="
        + this.isGraphicsCardEnabled() + ", Bluetooth=" + this.isBluetoothEnabled();
  }
  
}
