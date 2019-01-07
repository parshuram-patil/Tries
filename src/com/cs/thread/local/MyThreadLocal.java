package com.cs.thread.local;

public class MyThreadLocal {
  
  public static ThreadLocal<String>  localString  = new ThreadLocal<String>();
  public static ThreadLocal<Integer> localInteger = new ThreadLocal<Integer>();
  
  public static String getLocalString()
  {
    return localString.get();
  }
  
  public static void setLocalString(String value)
  {
    localString.set(value);
  }
  
  /*public static ThreadLocal<Integer> getLocalInteger()
  {
    return localInteger;
  }
  
  public static void setLocalInteger(ThreadLocal<Integer> localInteger)
  {
    MyThreadLocal.localInteger = localInteger;
  }*/
}