package com.demo.test;

import com.demo.Stack.MyStackArr;

public class TesstStackAR {

	public static void main(String[] args) {
		MyStackArr lst=new MyStackArr(3);
		lst.push(10);
		lst.push(20);
		lst.push(30);
//		lst.push(40);
		
		while(!lst.isEmpty())
		{
			System.out.println(lst.pop());
		}
	}

}
