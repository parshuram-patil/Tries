package com.cs.executor;

class ImplementsRunnable implements Runnable {
  
  private int    counter = 0;
  private String name;
  
  /*ImplementsRunnable(String name) {
    this.name = name;
  }*/
  
  public void run()
  {
    counter++;
    name = Thread.currentThread().getName();
    System.out.println("ImplementsRunnable --->" + this.hashCode() + " ---> Counter : " + counter);
  }
}

class ExtendsThread extends Thread {
  
  private int    counter = 0;
  private String name;
  
  /*ExtendsThread(String name)
  {
    this.name = name;
  }*/
  
  public void run()
  {
    counter++;
    name = Thread.currentThread().getName();
    System.out.println("ExtendsThread ---> " + this.hashCode() + " ---> Counter : " + counter);
  }
}

public class ThreadVsRunnable {
  
  public static void main(String args[]) throws Exception
  {
    // Multiple threads share the same object.
    ImplementsRunnable rc = new ImplementsRunnable();
    Thread t1 = new Thread(rc);
    t1.start();
    Thread.sleep(1000); // Waiting for 1 second before starting next thread
    Thread t2 = new Thread(rc);
    t2.start();
    Thread.sleep(1000); // Waiting for 1 second before starting next thread
    Thread t3 = new Thread(rc);
    t3.start();
    
    // Modification done here. Only one object is shered by multiple threads
    // here also.
    ExtendsThread extendsThread = new ExtendsThread();
    Thread thread11 = new Thread(extendsThread);
    thread11.start();
    Thread.sleep(1000);
    Thread thread12 = new Thread(extendsThread);
    thread12.start();
    Thread.sleep(1000);
    Thread thread13 = new Thread(extendsThread);
    thread13.start();
    Thread.sleep(1000);
  }
}