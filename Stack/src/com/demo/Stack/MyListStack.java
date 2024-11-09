package com.demo.Stack;

public class MyListStack {
	Node top;
	class Node
	{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data=data;
			next=null;
		}
		
	}
	public MyListStack() {
		super();
		top=null;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public void push(int val)
	{
		Node newnode=new Node(val);
		if(top==null)
		{
		top=newnode;
		}
		else
		{
			newnode.next=top;
			top=newnode;
		}
		
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp=top;
			top=temp.next;
			temp.next=null;
			return temp.data;
		}
		return -1;
	}
	

}
