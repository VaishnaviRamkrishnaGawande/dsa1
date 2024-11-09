package com.demo.test;

import com.demo.StackList.StackList;

public class TestStackList {

	public static void main(String[] args) {
		StackList lst=new StackList();
		lst.push(10);
		lst.push(20);
		lst.push(30);
		
		while(!lst.isEmpty()) {
			System.out.println(lst.pop());
		}
		
	}

}
