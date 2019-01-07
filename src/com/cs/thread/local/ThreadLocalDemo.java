package com.cs.thread.local;

class MyThread implements Runnable {
  
  public void run()
  {
    MyThreadLocal.setLocalString(Thread.currentThread().getName());
    try {
      Thread.sleep(1000);
      System.out.println(MyThreadLocal.getLocalString());
    }
    catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

public class ThreadLocalDemo {
  public static void main(String args[]) throws Exception
  {
    MyThread myThread = new MyThread();
    for(int i =0; i <=10; i++) {
      Thread thread = new Thread(myThread);
      thread.start();
      Thread.sleep(i*100);
    }
  }
}
