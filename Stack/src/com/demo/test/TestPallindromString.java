package com.demo.test;

import com.demo.Stack.MyStackArrChar;

public class TestPallindromString {

	public static void main(String[] args) {
		MyStackArrChar ls=new MyStackArrChar();
		String str="abbba";
		boolean status =isPallindrom(ls,str);
		if(status)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not pallindrome");
		}
	}

	private static boolean isPallindrom(MyStackArrChar ls, String str) {
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			ls.push(ch);
		}
		 for (int i = 0; i < str.length(); i++) {
            char ch1 = ls.pop();
            if (ch1 != str.charAt(i)) {
                return false; 
            }
            
        }
		 return true;
	}
}
