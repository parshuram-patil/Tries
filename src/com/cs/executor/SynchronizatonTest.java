package com.cs.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class SynchronizatonTest {
  
  public static void main(String args[]) throws Exception
  {
    SingletoneClass c = new SingletoneClass();
    int n = 4;
    CountDownLatch latch = new CountDownLatch(n);
    Thread thread;
    System.out.println("Started\n\n");
    for (int i = 1; i <= n; i++) {
      thread = new Thread(new MyThread(c, latch));
      thread.start();
      
    }
    
    
    latch.await();
    c.print();
    System.out.println("\n\nEnded...");
  }
}

class MyThread implements Runnable {
  
  private SingletoneClass c;
  private CountDownLatch  latch;
  
  MyThread(SingletoneClass c, CountDownLatch latch)
  {
    this.c = c;
    this.latch = latch;
  }
  
  @Override
  public void run()
  {
    try {
      // System.out.println(" Run from Runnable");
      Thread.sleep(1000);
      c.get();
      String name = Thread.currentThread().getName();
      //System.out.println("888 " + name);
      c.add(name);
      latch.countDown();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}

class SingletoneClass {
  
  private List<String> list = null;
  
  public void add(String e)
  {
    //System.out.println("Size -->" + list.size());
    this.list.add(e);
  }
  
  public void print()
  {
    System.out.print("List(" + this.list.size() + ") --> ");
    this.list.forEach(e -> System.out.print(e + "\t"));
  }
  
  public List<String> get()
  {
    synchronized (SingletoneClass.class) {
      if (this.list == null) {
        this.list = new ArrayList<>();
        //System.out.println(list.hashCode());
      }
    }
    
    return this.list;
  }
}
