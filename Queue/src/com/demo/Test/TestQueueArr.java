package com.demo.Test;

import com.demo.Queue.MyQueueArr;

public class TestQueueArr {

	public static void main(String[] args) {
		MyQueueArr lst=new MyQueueArr(5);
		lst.enQue(10);
		lst.enQue(20);
		lst.enQue(30);
		lst.enQue(40);
		lst.enQue(50);
		while(!lst.isEmpty())
		{
			System.out.println(lst.deque());
		}
		
		lst.enQue(50);
	}

}
