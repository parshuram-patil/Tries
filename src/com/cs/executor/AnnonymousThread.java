package com.cs.executor;


public class AnnonymousThread {
  public static void main(String args[])
  {
    Thread threadInstance1 = new Thread(new BasicThread() {
      @Override
      public void run()
      {
        Thread thread = Thread.currentThread();
        try {
          System.out.println("Run from BasicThread");
          thread.sleep(5000);
          synchronized (thread) {
            // System.out.println("Before wait");
            //thread.wait();
            // System.out.println("After wait");
          }
          
          System.out.println("Thread Ends...");
        }
        catch (InterruptedException iException) {
          iException.printStackTrace();
        }
      }
    });
    
    threadInstance1.run();
    threadInstance1.start();
    
    Thread threadInstance2 = new Thread(new BasicThread());
    threadInstance2.start();
  }
}