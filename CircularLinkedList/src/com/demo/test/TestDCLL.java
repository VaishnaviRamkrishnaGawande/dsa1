package com.demo.test;

import com.demo.CircularDoublyLinkList.CirecularDLL;

public class TestDCLL {

	public static void main(String[] args) {
		CirecularDLL lst=new CirecularDLL();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.display();
		System.out.println("-----------");
//		lst.deleteByPos(2);
		lst.deleteByPos(1);
		lst.display();
		System.out.println("-----------");

	}

}
