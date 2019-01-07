package com.cs.executor;

import java.util.HashMap;
import java.util.Map;

public class Test {
  
  public static void main(String args[])
  {
    // test(0, 1, 5);
    
    Test1 test11 = new Test1();
    //test11.setName(test11.getClass().getSimpleName());
    test11.setName("1");
    
    Test1 test12 = new Test1();
    //test12.setName(test12.getClass().getSimpleName());
    test12.setName("2");
    
    Test1 test13 = new Test1();
    //test13.setName(test13.getClass().getSimpleName());
    test13.setName("3");
    
    Test1 test14 = new Test1();
    test14.setName(test14.getClass().getSimpleName());
    
    Test2 test21 = new Test2();
    test21.setName(test21.getClass().getSimpleName());
    
    System.out.println(test11.equals(test12));
    
    Map<Test1, String> map = new HashMap<>();
    map.put(test11, "test11");
    map.put(test12, "test12");
    map.put(test13, "test13");
    System.out.println(map.keySet());
  }
  
  /*private static void test(int first, int second, int n)
  {
    if(n == 2) {
      System.out.println(second);
      return;
    }
    
    test(second, first + second, --n);
  }*/
}

class Test1 {
  
  String name;
  
  public String getName()
  {
    return name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  @Override
  public int hashCode()
  {
    //System.out.println("Getting HashCode --> " + name + ":" + name.hashCode());
    //return name.hashCode();
    return 1;
  }
  
  @Override
  public boolean equals(Object obj)
  {
    boolean status = false;
    
    if(this.getClass() == obj.getClass())
      status = true;
    else if(this == obj)
      status = true;
    else if(this.getName().equals(((Test1)obj).getName()))
      status = true;
    
    return status;
  }
}

class Test2 {
  
  String name;
  
  public String getName()
  {
    return name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
}