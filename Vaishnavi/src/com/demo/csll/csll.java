package com.demo.csll;

public class csll {
	 Node head,tail;
     class Node{
    	 int data;
    	 Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next=null;
		}	 
     }
	public csll() {
		super();
		this.head=null;
		this.tail=null;
	}
	//Add node
	public void AddNode(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
			tail=newnode;
			head.next=head;
		}else {
			tail.next=newnode;
			tail=newnode;
			tail.next=head;	
		}
	}
	//Display
	public void display()
	{
	if(head==null) {
		System.out.println("List is empty");
	}else {
		Node temp=head;
		while(temp.next!=head) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	}
	//At position
	public void Atpos(int val,int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node newnode=new Node(val);
			if(pos==1) {
				newnode.next=head;
				head=newnode;
				tail.next=newnode;	
			}else {
				Node temp=head;
				int i=1;
				for(;temp.next!=head && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(i>pos-2) {
					if(temp.next==head) {
						tail=newnode;
					}
					newnode.next=temp.next;
					temp.next=newnode;
				}
				else {
					System.out.println("Pos not found");
				}
			}
		}
	}
}

     