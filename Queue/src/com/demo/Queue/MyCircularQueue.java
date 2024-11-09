package com.demo.Queue;

public class MyCircularQueue {

	int arr[];
	int rear,front;
	public MyCircularQueue() {
		super();
		arr=new int[10];
		front=-1;
		rear=-1;
	}
	
	public MyCircularQueue(int size) {
		super();
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isEmpty()
	{
		return front==-1;
	}
	
	public boolean isFull()
	{
		if(front==0 && rear==arr.length-1)
		{
			return true;
		}
		if(front==rear+1)
		{
			return true;
		}
		return false;
	}
	
	public void Enqueue(int val)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else
		{
			if(front==-1)
				front=0;
			rear=(rear+1)%arr.length;
			arr[rear]=val;
			
		}
	}
	public int deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			int n=arr[front];
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else {
			front=(front+1)%arr.length;
			}return n;
		}
		return -1;
	}
	
}
