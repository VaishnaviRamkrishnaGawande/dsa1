package com.demo.test;

import com.demo.Stack.MyStackArrChar;

public class TestBal {

	public static void main(String[] args) {
         MyStackArrChar  lst=new MyStackArrChar();
         String str="{{{[]()}}}";
            boolean result=isbalance(lst,str);
            if(result) {
            	System.out.println("Balanced");
            }else {
            	System.out.println("Not Balance");
            }

	}

	private static boolean isbalance(MyStackArrChar lst, String str) {
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
		if(ch=='{' || ch=='[' || ch=='(')
		{
			lst.push(ch);
		}
		else {
			if(!lst.isEmpty()) 
			{
				char ch1=lst.pop();
				
				if((ch=='}'&& ch1!='{')||(ch==']'&& ch1!='[')||(ch==')'&& ch1!='(')) 
				{
				return false;
				}
			}
			else
				return false;
			
			}
		
		}
		if(lst.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
