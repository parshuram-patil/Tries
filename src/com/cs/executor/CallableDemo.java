package com.cs.executor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo implements Callable<String> {
  
  @Override
  public String call() throws Exception
  {
    System.out.println(Thread.currentThread()
        .getName() + " started");
    Thread.sleep(1000);
    
    return ">>> " + Thread.currentThread().getName() + " <<<";
  }
  
  public static void main(String args[]) throws Exception
  {
    
    System.out.println("*****   Callable Demo    *****");
    ExecutorService executor = Executors.newFixedThreadPool(5);
    List<Future<String>> list = new ArrayList<Future<String>>();
    CallableDemo callableDemo = new CallableDemo();
    
    for (int i = 0; i < 10; i++) {
      list.add(executor.submit(callableDemo));
    }
    
    
    while (true) {
      
      Iterator<Future<String>> iterator = list.iterator();
      while (iterator.hasNext()) {
        Future<String> next = iterator.next();
        if (next.isDone()) {
          System.out.println();
          System.out.println(next.get());
          System.out.println();
          iterator.remove();
        }
      }
      
      if (list.size() == 0)
        break;
    }
    
    /*for (Future<String> future : list) {
      if (future.isDone()) {
        System.out.println(" *** " + future.get());
        list.remove(future);
      }
    }*/
    
    /*Future<String> submit = executor.submit(callableDemo);
    submit.isDone();
    String output = submit.get();
    System.out.println( "Callable : " + output);*/
    
    executor.shutdown();
  }
}
