package com.demo.test;

import com.demo.CircularLinkList.CircularSLL;

public class TestCSLL {

	public static void main(String[] args) {
		CircularSLL lst=new CircularSLL();
		lst.addNode(10);
		lst.addNode(2);
		lst.addNode(3);
		lst.display();
		System.out.println("-----------");
		lst.addByPos(5, 2);
		lst.display();
	}


}
