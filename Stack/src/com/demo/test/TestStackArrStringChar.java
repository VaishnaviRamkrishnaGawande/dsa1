package com.demo.test;

import com.demo.Stack.MyStackArrChar;

public class TestStackArrStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStackArrChar lst=new MyStackArrChar();
		String s="Hello my fgdfg";
		for(int i=0;i<s.length();i++)
		{
			if(!lst.isFull())
			lst.push(s.charAt(i));
		}
		while(!lst.isEmpty())
		{
			System.out.println(lst.pop());
		}
	}

}
