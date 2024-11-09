package com.demo.Test;

import com.demo.Queue.MyCircularQueue;

public class TestCircular {

	public static void main(String[] args) {
		MyCircularQueue lst=new MyCircularQueue(5);
		lst.Enqueue(10);
		lst.Enqueue(20);
		lst.Enqueue(30);
		lst.Enqueue(40);
		lst.Enqueue(50);
		while(!lst.isEmpty())
		{
			System.out.println(lst.deQueue());
		}
		

	}

}
