package com.demo.test;

import com.demo.Stack.MyStackArrChar;

public class TestBalanceString {

	public static void main(String[] args) {
		
		MyStackArrChar st=new MyStackArrChar();
		String str="{[({}{})]}";
		boolean status=isBalanced(st,str);
		if(status)
		{
			System.out.println("String balanced");
		}
		else
		{
			System.out.println("Not balanced");
		}

	}

	private static boolean isBalanced(MyStackArrChar st, String str) {
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='{'||ch=='['||ch=='(')
			{
				st.push(ch);
			}
			else
			{
				if(!st.isEmpty())
				{
					char ch1=st.pop();
					
					if((ch=='}' &&ch1!='{' ) ||(ch==')'&&ch1!='(' )|| (ch==']'&&ch1!='['))
					{
						return false;
					}
					
				}
			}
		}
		if(st.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
