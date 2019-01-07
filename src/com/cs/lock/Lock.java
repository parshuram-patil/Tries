package com.cs.lock;

import java.util.HashMap;
import java.util.Map;

public class Lock {
  
  private volatile Thread               lockedBy         = null;
  private volatile static Lock          lock             = null;
  private volatile Map<String, Integer> lockedIdCountMap = new HashMap<>();
  
  private Lock()
  {
  }
  
  public static synchronized Lock getLockInstance() {
    if(lock == null) {
      lock = new Lock();
      return lock;
      //return new Lock();
    }
    
    return lock;
  }
  public synchronized void lock(String lockId) throws InterruptedException
  {
    System.out.println(System.currentTimeMillis() + " ---> " + Thread.currentThread().getName() + " ---> Aquiring lock ---> " + lockId);
    Thread callingThread = Thread.currentThread();
    while (lockedIdCountMap.containsKey(lockId) && lockedBy != callingThread) {
      System.out.println(System.currentTimeMillis() + " ---> " + Thread.currentThread().getName() + " ---> Waiting lock ---> " + lockId);
      wait();
    }
    Integer count = lockedIdCountMap.get(lockId);
    if(count == null) {
      count = 0;
    }
    lockedIdCountMap.put(lockId, count);;
    lockedBy = callingThread;
    System.out.println(System.currentTimeMillis() + " ---> " + Thread.currentThread().getName() + " ---> Aquired lock ---> " + lockId);
  }
  
  public synchronized void unlock(String lockId)
  {
    if (Thread.currentThread() == this.lockedBy) {
      Integer count = lockedIdCountMap.get(lockId);
      if (count == 0) {
        lockedIdCountMap.remove(lockId);
        System.out.println(System.currentTimeMillis() + " ---> " + Thread.currentThread().getName() + " ---> Unlocked");
        notify();
      }
      count--;
    }
  }
  
}
