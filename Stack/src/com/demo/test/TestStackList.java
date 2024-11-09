package com.demo.test;

import com.demo.Stack.MyListStack;

public class TestStackList {

	public static void main(String[] args) {
		MyListStack ls=new MyListStack();
		ls.push(10);
		ls.push(20);
		ls.push(30);
		
		while(!ls.isEmpty())
		{
			System.out.println(ls.pop());
		}

	}

}
