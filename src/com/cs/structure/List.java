package com.cs.structure;

public class List {
  
  public static void main(String[] args)
  {
    Node firstNode = new Node("Node 1");
    Node middleNode = new Node("Node 2");
    Node lastNode = new Node("Node 3");
    
    firstNode.nextNode = middleNode;
    middleNode.nextNode = lastNode;
    
    printList(firstNode);
    
  }
  
  private static void printList(Node node)
  {
    while (node != null) {
      System.out.println(node.value);
      node = node.nextNode;
    }
    
  }
  
}

class Node {
  
  String value    = null;
  Node   nextNode = null;
  
  public Node(String value)
  {
    this.value = value;
  }
}
