package com.demo.test;

import com.demo.csll.csll;

public class testcsll {

	public static void main(String[] args) {
	  csll lst=new csll();
	  lst.AddNode(10);
	  lst.AddNode(20);
	  lst.AddNode(30);
	  lst.display();
	  System.out.println("-------------");
	  lst.Atpos(40, 2);
	  lst.Atpos(5, 10);
	  lst.display();

	}

}