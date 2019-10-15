package com.cs.ds.stack;

public interface IStack<T> {

	boolean isEmpty();

	int size();

	void makeEmpty();

	T pop() throws StackOperationExcetion;

	int push(T item) throws StackOperationExcetion;

	T top();
}
