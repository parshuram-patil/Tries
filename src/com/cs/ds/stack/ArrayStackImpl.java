package com.cs.ds.stack;

import java.util.ArrayList;

class ArrayStackImpl {
	
	public static void main(String[] args) throws StackOperationExcetion {
		System.out.println("***** Array Stack Implementation *****\n");
		
		ArrayStack<String> arrayStack = new ArrayStack<String>(5);
		System.out.println(arrayStack.isEmpty());
		System.out.println(arrayStack.push("1"));
		System.out.println(arrayStack.push("2"));
		System.out.println(arrayStack.push("3"));
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.size());
		System.out.println(arrayStack.push("3"));
		System.out.println(arrayStack.push("4"));
		System.out.println(arrayStack.push("5"));
		arrayStack.makeEmpty();
		//System.out.println(arrayStack.pop());
		System.out.println(arrayStack.push("1"));
		System.out.println(arrayStack.push("2"));
		System.out.println(arrayStack.push("3"));
		System.out.println(arrayStack.push("4"));
		System.out.println(arrayStack.push("5"));
		System.out.println(arrayStack.size());
		//System.out.println(arrayStack.push("6"));
		
	}
}
