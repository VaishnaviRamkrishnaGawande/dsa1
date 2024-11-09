package com.demo.Stack;

public class MyStackArr {
	private int [] arr;
	private int top;
	public MyStackArr() {
		super();
		arr=new int[10];
		top=-1;
	}
	public MyStackArr(int size) {
		super();
		arr=new int[size];
		top=-1;
	}
	
	public boolean isFull()
	{
		return top==arr.length-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public void push(int val)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			arr[top]=val;
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			int n=arr[top];
			top--;
			return n;
		}
		return -1;
	}
	

}
