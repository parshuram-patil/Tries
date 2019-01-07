package com.cs.lock;

import java.util.Arrays;
import java.util.List;

public class LockDemo {
  
  public static void main(String[] args) throws InterruptedException
  {
    for (int i = 0; i <= 10; i++) {
      Runnable threadDemo = new ThreadDemo();
      Thread t = new Thread(threadDemo);
      t.start();
    }
  }
  
}


class ThreadDemo implements Runnable {

  @Override
  public void run()
  {
    List<String> lockObjects = Arrays.asList("Lock-1", "Lock-2");
    
    for (String lockObject : lockObjects) {
      try {
        Lock.getLockInstance().lock(lockObject);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
    System.out.println(System.currentTimeMillis() + " ---> " + Thread.currentThread().getName() + " --- > Proceing");
    
    try {
      Thread.sleep(1000);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    for (String lockObject : lockObjects) {
      Lock.getLockInstance().unlock(lockObject);
    }
  }
}