package com.cs.executor;

public class BasicThread implements Runnable {
  
  @Override
  public void run()
  {
    Thread thread = Thread.currentThread();
    try {
      System.out.println(" Run from Runnable");
      thread.sleep(5000);
      synchronized (thread) {
        // System.out.println("Before wait");
        thread.wait();
        // System.out.println("After wait");
      }
    }
    catch (InterruptedException iException) {
      iException.printStackTrace();
    }
  }
  
}
