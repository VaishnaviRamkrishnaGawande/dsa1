package com.demo.Stack;

public class MyStackArrString {
	 private String[] arr;
	   private int top;
	   
	
	public MyStackArrString() {
		super();
		arr=new String[10];
		top=-1;
	}
	
	public MyStackArrString(int size) {
		super();
		arr=new String[size];
		top=-1;
	}

	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==arr.length-1;
	}
	public  void push(String c) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			top++;
			arr[top]=c;
		}
	}
	public String pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else{
			String S=arr[top];
			top--;
			return S;
		}
		//return -1;
		return "NOt";
	}
	  	  
	}


