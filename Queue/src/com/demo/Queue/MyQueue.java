package com.demo.Queue;

public class MyQueue {
	Node front,rear;
	class Node
	{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			next=null;
		}	
	}
	public MyQueue() {
		super();
		front=null;
		rear=null;
	}
	
	public boolean isEmpty()
	{
		return front==null && rear==null;
	}
	
	public void Enque(int val)
	{
		Node newnode=new Node(val);
		if(front==null)
		{
			front=newnode;
			rear=newnode;
		}
		else {
		rear.next=newnode;
		rear=newnode;
		}
		
	}
	public int Deque()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else
			{
				Node temp=front;
				front=temp.next;
				temp.next=null;
				rear=null;
				return temp.data;
			}
		
		return -1;
	}

}
