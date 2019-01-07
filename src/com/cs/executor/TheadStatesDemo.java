package com.cs.executor;


public class TheadStatesDemo {
  
  public static void main(String args[]) throws InterruptedException{
    
    RunnableThread extendsThread1 = new RunnableThread();
    Thread thread11 = new Thread(extendsThread1);
    thread11.start();
    Thread.sleep(1000);
    
    RunnableThread extendsThread2 = new RunnableThread();
    Thread thread12 = new Thread(extendsThread2);
    thread12.start();
    Thread.sleep(1000);

    
    ThreadThread extendsThread3 = new ThreadThread();
    extendsThread3.start();
    Thread.sleep(1000);

    
    ThreadThread extendsThread4 = new ThreadThread();
    extendsThread4.start();
    Thread.sleep(1000);
  }
  
}


class RunnableThread implements Runnable {
  
  private Integer cnt = 0;
  
  @Override
  public void run() {
    Thread thread = Thread.currentThread();
    try{
      System.out.println(++cnt);
      //thread.sleep(1000);
      
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}

class ThreadThread extends Thread {
  
  private Integer cnt = 0;
  
  @Override
  public void run() {
    Thread thread = Thread.currentThread();
    try{
      System.out.println(++cnt);
      thread.sleep(1000);
      
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
