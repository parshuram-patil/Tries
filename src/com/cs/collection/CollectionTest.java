package com.cs.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
  
  public static void main(String args[])
  {
    
    List<String> docTypes = new ArrayList<String>();
    docTypes.add("1");
    docTypes.add("2");
    docTypes.add("3"); 
    
    System.out.println(docTypes);
    
    docTypes = updateDocTypes(docTypes);
    
    System.out.println(docTypes);
    
    List numList = Collections.singletonList(new Integer(10));
    
    System.out.println("numList elements: " + numList);
    
    // numList.add(20); // throws UnsupportedOperationException
    
    List stringList = Collections.singletonList("hello");
    stringList.add("Hi");
    System.out.println("\nstringList elements: " + stringList);
    
    // stringList.add("world"); // throws UnsupportedOperationException
  }

  private static List<String> updateDocTypes(List<String> docTypes)
  {
    List<String> updatedDocTypes = new ArrayList<String>();
    
    for(String docType : docTypes) {
      updatedDocTypes.add("4");
    }
    
    return updatedDocTypes;
  }
}
