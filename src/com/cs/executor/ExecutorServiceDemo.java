package com.cs.executor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
  
  public static void main(String[] args) throws Exception
  {
    //exeutorServiceDemo();
    simpleThreadDemo();
    
    Map<Integer, Object> map = new HashMap();
    map.put(1, 1);
    map.put(2, 2);
    Object values = (List<Object>) map.values();
    /*for(int i=1; i <=10; i++) {
      demo = new ThreadDemo();
      pool.submit(demo);
    }*/
    
    /*if(pool.isTerminated()) {
      System.out.println("All done....");
    }
    else {
      System.out.println("Something is pending....");
    }*/
    
  }

  private static void simpleThreadDemo() throws Exception
  {
    //RunnableThreadDemo demo;
    ThreadDemo thread = null;
    for(int i=1; i <=1; i++) {
      //System.out.println("1 " + Thread.currentThread().getName()  + " : " + Thread.currentThread().getState());
      //demo = new RunnableThreadDemo();
      thread = new ThreadDemo();
      System.out.println("1 " + thread.getName()  + " : " + thread.getState());
      //System.out.println("2 " + Thread.currentThread().getName()  + " : " + Thread.currentThread().getState());
      thread.start();
      thread.join();
      System.out.println("Done");
      System.out.println("3 " + thread.getName()  + " : " + thread.getState());
      int count = 0;
      while(true) {
        count++;
        Thread.sleep(1000);
        System.out.println("3 " + thread.getName()  + " : " + thread.getState());
        if(Thread.State.TERMINATED == thread.getState()){
          break;
        }
        if(count == 10) {
          synchronized (thread) {
            thread.notify();
          }
        }
      }
    }
    
  }

  private static void exeutorServiceDemo() throws Exception
  {
    //RunnableThreadDemo demo;
    ThreadDemo demo = null;
    ExecutorService pool = Executors.newFixedThreadPool(5);
    for(int i=1; i <=1; i++) {
      //demo = new RunnableThreadDemo();
      demo = new ThreadDemo();
      System.out.println("2 " + Thread.currentThread().getName()  + " : " + Thread.currentThread().getState());
      System.out.println("" + demo.getName()  + " : " + demo.getState());
      pool.submit(demo).get();
      System.out.println("3 " + demo.getName()  + " : " + demo.getState());
    }
    
    //System.out.println("Shutting down ExecutorService");
    pool.shutdown();
  }
  
}


class ThreadDemo extends Thread {
  
  @Override
  public void run()
  {
       try {
        Thread.sleep(5000);
        synchronized (this) {
          //this.wait();
        }
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
       System.out.println("5 " + Thread.currentThread().getName()  + " : " + Thread.currentThread().getState());
  }
  
}

class RunnableThreadDemo implements Runnable {
  
  @Override
  public void run()
  {
    try {
      Thread.sleep(5000);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("5 " + Thread.currentThread().getName()  + " : " + Thread.currentThread().getState());
  }
  
}