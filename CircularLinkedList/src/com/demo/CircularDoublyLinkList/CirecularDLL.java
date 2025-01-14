package com.demo.CircularDoublyLinkList;

public class CirecularDLL {
	Node head;
	class Node{
		int data;
		Node next,prev;
		public Node(int data) {
			super();
			this.data = data;
			next=null;
			prev=null;
		}
		
	}
	public CirecularDLL() {
		super();
		head=null;
	}
	
	public void add(int val)
	{
		Node newnode=new Node(val);
		if(head==null)
		{
			head=newnode;
			newnode.next=newnode;
			newnode.prev=newnode;
		}
		else
		{
			Node tail=head.prev;
			tail.next=newnode;
			newnode.next=head;
			newnode.prev=tail;
			head.prev=newnode;
		}
	}
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	public void deleteByPos(int pos)
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp=head;
			if(pos==1)
			{
				head.prev.next=temp.next;
				temp.next.prev=temp.prev;
				head=temp.next;
			}
			else
			{
				int i=1;
				for(;temp.next!=head && i<=pos-1;i++)
				{
					temp=temp.next;
				}
				if(i>pos-1)
				{
					temp.next.prev=temp.prev;
					temp.prev.next=temp.next;
					temp.next=null;
					temp.prev=null;
					temp=null;
				}else
				{
					System.out.println("Pos not found");
				}
			}
		}
	}
	

}
