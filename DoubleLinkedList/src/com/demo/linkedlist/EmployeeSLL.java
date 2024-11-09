package com.demo.linkedlist;

import com.demo.beans.Employee;

public class EmployeeSLL {
	class node{
		Employee data;
		node next;
		public node(Employee data) {
			super();
			this.data = data;
			this.next=null;
			}
	}
	node head;
	public EmployeeSLL() {
		head=null;
	}
	public void addNode(Employee obj)
	{
		node newnode=new node(obj);
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
		}
	}
	public void displayAll()
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
	public void deleteByID(int id)
	{
		node temp=head;
		if(head.data.getEmpid()==id)
		{
			head=temp.next;
			temp.next=null;
			temp=null;
		}
		else
		{
			node prev=null;
			while(temp!=null && temp.data.getEmpid()!=id)
			{
				prev=temp;
				temp=temp.next;
			}
			if(temp.data.getEmpid()==id)
			{
				prev.next=temp.next;
				temp.next=null;
				temp=null;
			}
			else
			{
				System.out.println("ID not found");
			}
		}
	}public void searchBiId(int id)
	{
		node temp=head;
		while(temp!=null && temp.data.getEmpid()!=id)
		{
			temp=temp.next;
		}
		if(temp!=null && temp.data.getEmpid()==id)
		{
			System.out.println(temp.data);
		}
		else
			System.out.println("ID not found"+id);
	}
	

}
