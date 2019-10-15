package com.cs.ds.stack;

class ArrayStack<T> implements IStack<T> {

	public static final int DEFAUT_STACK_SIZE = 1024;
	private Object[] stack;
	private int top = -1;
	private int size;

	ArrayStack() {
		this.size = DEFAUT_STACK_SIZE;
		createStack(size);
	}

	ArrayStack(int size) {
		this.size = size;
		createStack(size);
	}

	@Override
	public boolean isEmpty() {

		return (top < 0);
	}

	@Override
	public int size() {

		return (top + 1);
	}

	@Override
	public void makeEmpty() {
		top = -1;
		createStack(size);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() throws StackOperationExcetion {
		if (top < 0)
			throwException("Unable to pop, Stack is emplty!!!");

		return (T) stack[top--];
	}

	@Override
	public int push(T item) throws StackOperationExcetion {
		if (top >= (size - 1))
			throwException("Unable to push, Stack is full!!!");
		stack[++top] = item;

		return top + 1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T top() {

		return (T) stack[top];
	}

	private void createStack(int size) {
		stack = new Object[size];
	}

	private void throwException(String msg) throws StackOperationExcetion {

		throw new StackOperationExcetion(msg);
	}
}
