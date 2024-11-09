package com.demo.dll;

public class dll {
	Node head;
     class Node{
    	 int data;
    	 Node next,prev;
		public Node(int data) {
			super();
			this.data = data;
			this.next=null;
			this.prev=null;
			}
     }
     
     
     public dll() {
		super();
		this.head=null;
	}
	//Add
     public void AddNode(int val) {
    	 Node newnode=new Node(val);
    		 if(head==null) {
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
     //Display
     public void display() {
    	
    	 if(head==null) {
    		 System.out.println("lis is empty");
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
//    	 Node temp=head;
// 		if(head!=null)
// 		{
// 			while(temp!=null)
// 			{
// 				System.out.println(temp.data);
// 				temp=temp.next;
// 			}
// 		}
     }
     public void AddAtPos(int val,int pos) {
    	 Node newnode=new Node(val) ;
    		 if(pos==1) {
    			 if(head==null) {
    				 head=newnode;
    			 }else {
    				 newnode.next=head;
    				 head.prev=newnode;
    				 head=newnode;
    			 }
    		 }else {
    			 Node temp=head;
    			 for(int i=1;temp!=null && i<=pos-2;i++) {
    				 temp=temp.next;
    			 }
    			 if(temp==null) {
    				 System.out.println("Beyond limit");
    			 }
    			 else {
    				 newnode.next=temp.next;
    				 if(temp.next!=null) {
    					 temp.next.prev=newnode;
    				 }
    				 newnode.prev=temp;
    				 temp.next=newnode;
    				 
    			 }
    		 }
     }
     //Del At pos
//     public void DelAtPos(int pos) {
//    	 Node temp=head;
//    	 if(pos==1) 
//    	 {
//    		 if(head!=null)
//    		 {
//    			 head=head.next;
//    			 if(temp.next!=null) 
//    			 {
//    				 temp.next.prev=null;
//    				 temp.next=null;
//    				 temp=null;
//    			 }
//    			 else 
//    			 {
//    			 System.out.println("Post not found");
//    			 }
//    		 }
//    		 else {
//    			 for(int i=1;temp!=null && i<pos-1;i++) {
//    				 temp=temp.next;
//    			 }if(temp!=null) {
//    				 temp.prev.next=temp.next;
//    				 if(temp.next!=null) {
//    					 temp.next.prev=temp.prev;
//    				 }
//    				 temp.prev=null;
//    				 temp.next=null;
//    				 temp=null;
//    			 }
//    		 }
//    		 
    	 
     public void displayInorder()
     {
    	Node temp=head;
    	while(temp.next!=null)
    	{
    		temp=temp.next;
    	}
    	while(temp!=null)
    	{
    		System.out.println(temp.data);
    		temp=temp.prev;
    	}
     }
     }
     
