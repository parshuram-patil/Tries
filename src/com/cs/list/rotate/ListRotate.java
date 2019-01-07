package com.cs.list.rotate;

public class ListRotate {
  
    public static Node rotateList(Node head, int n)
  {
    int len = 1;
    Node tmp = head;
    while (tmp.getNext() != null) {
      //System.out.println(tmp.getName());
      tmp = tmp.getNext();
      len++;
    }
    
    System.out.println(len);
    
    /*int len = 1;
    while (head.getNext() != null) {
      len++;
    }*/
    
    Node heads = head;
    Node curr = null;
    Node prev = null;
    Node nextNode = null;
    
    for (int i = 1; i < len; i++) {
      curr = heads;
      //nextNode = heads.getNext();
      //System.out.println(nextNode.getName());
      if (i == len - n + 1) {
        curr.setNext(head);
      }
      else if (i >= len - n + 1) {
        curr.setNext(prev);
        head = curr;
      }
      else if (i == len - n) {
        curr.setNext(null);
      }
      heads = heads.getNext();
      prev = curr;
    }
    
    tmp = head;
    while (tmp.getNext() != null) {
      System.out.println(tmp.getName());
      tmp = tmp.getNext();
      len++;
    }
    
    return head;
    
  }
  
  public static void main(String[] args)
  {
    Node node1 = new Node();
    node1.setName("Node - 1");
    
    Node node2 = new Node();
    node2.setName("Node - 2");
    
    Node node3 = new Node();
    node3.setName("Node - 3");
    
    Node node4 = new Node();
    node4.setName("Node - 4");
    
    Node node5 = new Node();
    node5.setName("Node - 5");
    
    node1.setNext(node2);
    node2.setNext(node3);
    node3.setNext(node4);
    node4.setNext(node5);
    node5.setNext(null);
    
    rotateList(node1, 2);
  }
}
