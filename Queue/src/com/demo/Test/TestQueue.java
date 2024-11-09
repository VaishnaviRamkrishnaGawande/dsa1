package com.demo.Test;


import com.demo.Queue.MyQueue;

public class TestQueue {

	public static void main(String[] args) {
		MyQueue lst=new MyQueue();
		lst.Enque(10);
		lst.Enque(20);
//		lst.Deque();
		
		while(!lst.isEmpty())
		{
			System.out.println(lst.Deque());
		}
		

	}

}
