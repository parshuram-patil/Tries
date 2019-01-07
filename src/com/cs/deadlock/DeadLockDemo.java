package com.cs.deadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.TimeUnit;

public interface DeadLockDemo {
  
  static void testDeadLock()
  {
    final Object lock1 = new Object();
    final Object lock2 = new Object();
    
    Thread thread1 = new Thread(new Runnable()
    {
      
      @Override
      public void run()
      {
        synchronized (lock1) {
          System.out.println("Thread1 acquired lock1");
          try {
            TimeUnit.MILLISECONDS.sleep(50);
          }
          catch (InterruptedException ignore) {
          }
          synchronized (lock2) {
            System.out.println("Thread1 acquired lock2");
          }
        }
      }
      
    });
    thread1.start();
    
    Thread thread2 = new Thread(new Runnable()
    {
      
      @Override
      public void run()
      {
        synchronized (lock2) {
          System.out.println("Thread2 acquired lock2");
          try {
            TimeUnit.MILLISECONDS.sleep(50);
          }
          catch (InterruptedException ignore) {
          }
          synchronized (lock1) {
            System.out.println("Thread2 acquired lock1");
          }
        }
      }
    });
    thread2.start();
    
    // Wait a little for threads to deadlock.
    try {
      TimeUnit.MILLISECONDS.sleep(100);
    }
    catch (InterruptedException ignore) {
    }
  }
  
  static void detectDeadlock()
  {
    ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
    long[] threadIds = threadBean.findMonitorDeadlockedThreads();
    int deadlockedThreads = threadIds != null ? threadIds.length : 0;
    System.out.println("Number of deadlocked threads: " + deadlockedThreads);
    handleDeadlock(threadBean.getThreadInfo(threadIds));
  }
  
  static void handleDeadlock(final ThreadInfo[] deadlockedThreads) {
    if (deadlockedThreads != null) {
      System.err.println("Deadlock detected!");
      
      for (ThreadInfo threadInfo : deadlockedThreads) {
      
        if (threadInfo != null) {
      
          for (Thread thread : Thread.getAllStackTraces().keySet()) {
        
            //if (thread.getId() == threadInfo.getThreadId()) {
              System.err.println(threadInfo.toString().trim());
                
              for (StackTraceElement ste : thread.getStackTrace()) {
                  System.err.println("\t" + ste.toString().trim());
              }
            //}
          }
        }
      }
    }
  }
  
  public static void main(String[] args) throws InterruptedException
  {
    testDeadLock();
    detectDeadlock();
  }
}
