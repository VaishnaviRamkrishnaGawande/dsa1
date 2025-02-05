package com.demo.linkedlist;

public class DoublyLinkedList {
	class node
	{
		int data;
		node next,prev;
		public node(int data) {
			super();
			this.data = data;
			this.next=null;
			this.prev=null;
		}
		
	}
	node head;
	public DoublyLinkedList() {
		head=null;
	}
	public void addNode(int val)
	{
		node newnode=new node(val);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
			 
		}
	}
	public void display()
	{
		node temp=head;
		if(head!=null)
		{
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	
	public void addBypos(int val,int pos)
	{
		node newnode=new node(val);
		if(pos==1)
		{
			if(head==null)
			{
				head=newnode;
			}
			else
			{
				newnode.next=head;
				head.prev=newnode;
				head=newnode;
			}
		}else
		{
			node temp=head;
			for(int i=1;temp!=null && i<=pos-2;i++)
			{
				temp=temp.next;
			}
			if(temp==null)
			{
				System.out.println("Beyond limit");
			}
			else
			{
				newnode.next=temp.next;
				if(temp.next!=null)
				{
					temp.next.prev=newnode;
				}
				newnode.prev=temp;
				temp.next=newnode;
			}
		}
	}
	public void deleteBypos(int pos)
	{
		node temp=head;
		if(pos==1)
		{
			if(head!=null)
			{
				head=head.next;
				if(temp.next!=null)
				{
					temp.next.prev=null;
					temp.next=null;
					temp=null;
				}
				else
				{
					System.out.println("Postion not found"+pos);
				}
			}
		}
			else
			{
				for(int i=1;temp!=null && i<=pos-1;i++)
				{
					temp=temp.next;
				}
				if(temp!=null)
				{
					temp.prev.next=temp.next;
					if(temp.next!=null)
					{
						temp.next.prev=temp.prev;
					}
					temp.prev=null;
					temp.next=null;
					temp=null;
				}
			}
		
	}
	public void addBeforeKey(int val,int key)
	{
		node newnode=new node(val);
		if(head.data==key)
		{
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
			
		}
		else
		{
			node temp=head;
			while(temp!=null && temp.data!=key)
			{
				temp=temp.next;
			}
			if(temp!=null)
			{
				newnode.next=temp;
				newnode.prev=temp.prev;
				temp.prev.next=newnode;
				temp.prev=newnode;
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}
	public void AddAfterKey(int val,int key) {
			if(head==null) {
				System.out.println("List is empty");
			}else {
				node newnode=new node(val);
				node temp=head;
				while(temp!=null && temp.data!=key) {
					temp=temp.next;
			}
				if(temp!=null) {
					newnode.next=temp.next;
					newnode.prev=temp;
					if(temp.next!=null) {
						temp.next.prev=newnode;
					}
					temp.next=newnode;
				}
				else {
					System.out.println("Not found");
				}
		}
	}

}
