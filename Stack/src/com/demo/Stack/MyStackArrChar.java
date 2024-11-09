package com.demo.Stack;

public class MyStackArrChar {
   private char[] arr;
   private int top;
public MyStackArrChar() {
	super();
	arr=new char[20];
	top=-1;
}
public MyStackArrChar(int size) {
	super();
	arr=new char[size];
	top=-1;
	
}
public boolean isEmpty() {
	return top==-1;
}
public boolean isFull() {
	return top==arr.length-1;
}
public  void push(char val) {
	if(isFull()) {
		System.out.println("Stack is full");
	}else {
		top++;
		arr[top]=val;
	}
}
public char pop() {
	if(isEmpty()) {
		System.out.println("Stack is empty");
	}else{
		char ch=arr[top];
		top--;
		return ch;
	}
	//return -1;
	return '@';
}
   
  
}