package com.demo.test;

import com.demo.Stack.MyStackArrString;

public class TestStackArrString {

	public static void main(String[] args) {
		MyStackArrString lst=new MyStackArrString();
		lst.push("Hello");
		lst.push("Mr.");
		lst.push("India");
		
		while(!lst.isEmpty())
		{
			System.out.println(lst.pop());
		}
	}
	

}
