package com.demo.HashingLinkList;

public class HashingLinkList {
	Node head;
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
	public HashingLinkList() {
		super();
		head=null;
	}
	
	public void add(int val)
	{
		Node newnode= new Node(val); 
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			newnode.next=head;
			head=newnode;
		}
	}
	
	public boolean Search(int val)
	{
		if(head==null)
		{
			return false;
		}
		else
		{
			Node temp=head;
			while(temp!=null && temp.data!=val)
			{
				temp=temp.next;
			}
			if(temp!=null && temp.data==val)
			{
				return true;
			}
			else
				return false;
			
		}
		
	}
	
	public boolean delete(int val)
	{
		if(head==null)
		{
			return false;
		}
		else
		{
			Node temp=head;
			if(head.data==val)
			{
				head=head.next;
			}
			else
			{
				Node prev=null;
				while(temp!=null && temp.data!=val)
				{
					prev=temp;
					temp=temp.next;
				}
				if(temp.data==val)
				{
					prev.next=temp.next;
				}
				else
					return false;
			}
			temp.next=null;
			temp=null;
			return true;
		}
		
		
	}
	public void display() {
		if(head==null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		System.out.println("Null");
	}
}
