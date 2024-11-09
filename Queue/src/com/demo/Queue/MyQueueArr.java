package com.demo.Queue;

public class MyQueueArr {
	int [] arr;
	int front,rear;
	public MyQueueArr() {
		super();
		arr=new int[10];
		front=0;
		rear=0;
	}
	public MyQueueArr(int size) {
		super();
		arr=new int[size];
		front=0;
		rear=0;
	}
	public boolean isFull()
	{
		return rear==arr.length;
	}
	public boolean isEmpty() {
		return rear==front;
	}
	public void enQue(int val)
	{
		if(isFull())
		{
			System.out.println("Queu is full");
		}
		else
		{
			arr[rear]=val;
			rear++;
		}
	}
	public int deque()
	{
		if(isEmpty())
		{
			System.out.println("Queu is empty");
		}
		else
		{
			int n=arr[front];
			front++;
			return n;
		}
		return -1;
	}

}
