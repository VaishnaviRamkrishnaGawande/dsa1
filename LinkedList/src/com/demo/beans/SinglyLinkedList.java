package com.demo.beans;

public class SinglyLinkedList {
	class Node
	{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next=null;
		}
		}
	 Node head;
	 
	public SinglyLinkedList() {
		head=null;
	}
	public void addNode(int val)
	{
		Node newnode=new Node(val);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	public void addByPos(int val,int pos)
	{
		if(head==null && pos>1)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node newnode=new Node(val);
			if(pos==1)
			{
				newnode.next=head;
				head=newnode;
			}
			else
			{
				Node temp=head;
				for(int i=1;temp!=null && i<=pos-2;i++)
				{
					temp=temp.next;
					
				}
				if(temp!=null)
				{
					newnode.next=temp.next;
					temp.next=newnode;
				}
				else
				{
					System.out.println("Beyoun limit");
				}
			}
		}
		
	}
	public void displayAll()
	{
		if(head==null)
		{
			System.out.println("List is empty");
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
	}
		public void deleteByval(int val)
		{
			if(head==null)
			{
				System.out.println("List is empty");
			}
			else
			{
				Node temp=head,prev=null;
				if(head.data==val)
				{
					head=temp.next;
					temp.next=null;
					temp=null;
				}
				else {
					while(temp!=null && temp.data!=val)
					{
						prev=temp;
						temp=temp.next;
					}
					if(temp!=null) {
						prev.next=temp.next;
						temp.next=null;
						temp=null;
					}
					else
					{
						System.out.println("Not found");
					}
				}
			}
		}
			
	}
	

